package yeehaw.message.main.msgstream;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageRes {
	
	String PUSH_RES = "push_res";
	String BIND_RES = "bind_res";
	String SMS_RES = "sms_res";
	String CHALLENGE_RES = "challenge_res";
	
	@Output(MessageRes.PUSH_RES)
	MessageChannel push();
	
	@Output(MessageRes.SMS_RES)
	MessageChannel sms();

	@Output(MessageRes.CHALLENGE_RES)
	MessageChannel challenge();

	@Output(MessageRes.BIND_RES)
	MessageChannel bind();
}
