package yeehaw.message.main.msgstream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MessageRecevier {

	String PUSH_RECEVIER = "push_recevier";
	String BIND_RECEVIER = "bind_recevier";
	String SMS_RECEVIER = "sms_recevier";
	String CHALLENGE_RECEVIER = "challenge_recevier";
	
	@Input(MessageRecevier.PUSH_RECEVIER)
	SubscribableChannel pushRes();
	
	@Input(MessageRecevier.SMS_RECEVIER)
	SubscribableChannel smsRes();
	
	@Input(MessageRecevier.CHALLENGE_RECEVIER)
	SubscribableChannel challengeRes();
	
	@Input(MessageRecevier.BIND_RECEVIER)
	SubscribableChannel bindRes();
	
}
