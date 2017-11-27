package yeehaw.message.main.msgstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

import team.union.tool.json.JsonUtils;


@EnableBinding(MessageClient.class)
public class MessageReturnClient {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@StreamListener(MessageClient.PUSH_RETURN)
	public void pushRecevier(Object message) {
		logger.info("\r\n push回调收到： " + JsonUtils.to(message));
	}

	@StreamListener(MessageClient.BIND_RETURN)
	public void bindRecevier(Object payload) {
		logger.info("\r\n bind回调收到： " + payload);
	}

	@StreamListener(MessageClient.CHALLENGE_RETURN)
	public void challengeRecevier(Object payload) {
		logger.info("\r\n challenge回调收到： " + payload);
	}

	@StreamListener(MessageClient.SMS_RETURN)
	public void smsRecevier(Object payload) {
		logger.info("\r\n sms回调收到： " + payload);
	}

}
