package yeehaw.message.main.message.o;

import yeehaw.message.main.message.e.Category;
import yeehaw.message.main.message.e.Channel;

@SuppressWarnings("serial")
public class ChallengeMessage extends BaseMessage {

	public ChallengeMessage() {

		setCategory(Category.RANDOM.getValue());
		setChannel(Channel.SMS.getValue());
		setSilent(true);
	}

	/**
	 * 构造函数
	 * 
	 * @param sourceMsgId
	 *            发送方消息流水号
	 * @param source
	 *            发送方标识 {@link cn.com.inlee.utils.constant.SystemIdentity}
	 * @param target
	 *            接收方MId
	 * @param title
	 *            标题
	 * @param silent
	 *            是否静默信息
	 */
	public ChallengeMessage(String sourceMsgId, String source, String target, String content) {
		setSourceSN(sourceMsgId);
		setSource(source);
		setTitle("challenge");
		setTargets(new String[] { target });
		setProfile(content);
		setCategory(Category.RANDOM.getValue());
		setChannel(Channel.SMS.getValue());
		setSilent(true);
	}

}
