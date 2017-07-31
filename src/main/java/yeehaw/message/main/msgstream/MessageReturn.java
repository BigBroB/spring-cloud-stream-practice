package yeehaw.message.main.msgstream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
/**
 * 接收回调通道
 * @ClassName: MessageReturn 
 * @Description: TODO 
 * @author yangyihao
 * @date 2017年7月28日 上午9:15:56 
 *
 */
public interface MessageReturn {

	String PUSH_RETURN = "push_return";
	String BIND_RETURN = "bind_return";
	String SMS_RETURN = "sms_return";
	String CHALLENGE_RETURN = "challenge_return";
	
	@Input(MessageReturn.PUSH_RETURN)
	SubscribableChannel pushRes();
	
	@Input(MessageReturn.SMS_RETURN)
	SubscribableChannel smsRes();
	
	@Input(MessageReturn.CHALLENGE_RETURN)
	SubscribableChannel challengeRes();
	
	@Input(MessageReturn.BIND_RETURN)
	SubscribableChannel bindRes();
	
}
