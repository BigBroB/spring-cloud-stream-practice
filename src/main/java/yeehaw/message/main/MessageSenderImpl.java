package yeehaw.message.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Component;

import cn.com.inlee.utils.exception.ThirdAPIException;
import cn.com.inlee.utils.exception.UnrecognizableClassException;
import cn.com.inlee.utils.response.ClientResponse;
import yeehaw.message.main.message.o.ChallengeMessage;
import yeehaw.message.main.message.o.IMessage;
import yeehaw.message.main.message.o.Terminal;
import yeehaw.message.main.message.o.TextMessage;
import yeehaw.message.main.msgstream.MessageClient;

@EnableBinding(value = { MessageClient.class })
@Component("messageSender")
public class MessageSenderImpl implements MessageSender {

	@Autowired
	MessageClient messageClient;

	@Autowired
	@Qualifier(MessageClient.PUSH)
	private MessageChannel push;

	@Autowired
	@Qualifier(MessageClient.BIND)
	private MessageChannel bind;

	@Autowired
	@Qualifier(MessageClient.CHALLENGE)
	private MessageChannel challenge;

	@Autowired
	@Qualifier(MessageClient.SMS)
	private MessageChannel sms;

	@Override
	public ClientResponse bind(Terminal terminal) throws ThirdAPIException {
		try {
			messageClient.bind().send(MessageBuilder.withPayload(terminal).build());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ThirdAPIException("访问消息中心失败。");
		}
		return ClientResponse.newInstance().ok().builder();
	}

	@Override
	public ClientResponse sendChallenge(String sn, String source, String cell, String text) throws ThirdAPIException {
		try {
			ChallengeMessage message = new ChallengeMessage(sn, source, cell, text);
			messageClient.challenge().send(MessageBuilder.withPayload(message).build());
			// challenge.send(MessageBuilder.withPayload(message).build());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ThirdAPIException("访问消息中心失败。");
		}
		return ClientResponse.newInstance().ok().builder();
	}

	@Override
	public ClientResponse sendSM(TextMessage message) throws ThirdAPIException, UnrecognizableClassException {
		try {
			messageClient.sms().send(MessageBuilder.withPayload(message).build());
			// sms.send(MessageBuilder.withPayload(message).build());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ThirdAPIException("访问消息中心失败。");
		}
		return ClientResponse.newInstance().ok().builder();
	}

	@Override
	public ClientResponse push(IMessage message) throws ThirdAPIException {
		try {
			messageClient.push().send(MessageBuilder.withPayload(message).build());
			// push.send(MessageBuilder.withPayload(message).build());
		} catch (Exception e) {
			e.printStackTrace();
			throw new ThirdAPIException("访问消息中心失败。");
		}
		return ClientResponse.newInstance().ok().builder();
	}

	@Override
	public void pushAsyn(IMessage message) throws ThirdAPIException {

	}

}
