package yeehaw.message.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;

import cn.com.inlee.utils.JsonUtils;
import yeehaw.message.main.message.o.BaseMessage;
import yeehaw.message.main.msgstream.MessageClient;

@EnableBinding(MessageClient.class)
public class MessageRecevierClient {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@StreamListener(MessageClient.PUSH_RECEVIER)
	@SendTo(MessageClient.PUSH_RES)
	public Object pushRecevier(BaseMessage message) {
		logger.info("\r\n push收到： "+JsonUtils.to(message));
		return "push 收到";
	}
	
	@StreamListener(MessageClient.BIND_RECEVIER)
	@SendTo(MessageClient.BIND_RES)
	public Object bindRecevier(BaseMessage payload ) {
		logger.info("\r\n bind收到： "+payload);
		return "bind 收到";
	}
	
	@StreamListener(MessageClient.CHALLENGE_RECEVIER)
	@SendTo(MessageClient.CHALLENGE_RES)
	public Object challengeRecevier(BaseMessage payload ) {
		logger.info("\r\n challenge收到： "+payload);
		return "challenge 收到";
	}
	
	@StreamListener(MessageClient.SMS_RECEVIER)
	@SendTo(MessageClient.SMS_RES)
	public Object smsRecevier(BaseMessage payload ) {
		logger.info("\r\n sms收到： "+payload);
		return "sms 收到";
	}
	
	
}
