package yeehaw.message.main.message.o;

import java.util.Map;

import yeehaw.message.main.message.e.Category;
import yeehaw.message.main.message.e.Channel;

@SuppressWarnings("serial")
public class TextMessage extends BaseMessage {

	public TextMessage() {
		setCategory(Category.TEXT.getValue());
		setChannel(Channel.PUSH.getValue());
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
	public TextMessage(String sourceMsgId, String source, String target, String title, boolean silent) {
		this(sourceMsgId, source, new String[] { target }, title, null, null, silent);
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
	 * @param content
	 *            内容
	 * @param silent
	 *            是否静默信息
	 */
	public TextMessage(String sourceMsgId, String source, String target, String title, String content, boolean silent) {
		this(sourceMsgId, source, new String[] { target }, title, content, null, silent);
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
	 * @param content
	 *            内容
	 * @param options
	 *            扩展内容
	 * @param silent
	 *            是否静默信息
	 */
	public TextMessage(String sourceMsgId, String source, String[] targets, String title, String content,
			Map<String, String> options, boolean silent) {
		setSourceSN(sourceMsgId);
		setSource(source);
		setTargets(targets);
		setTitle(title);
		setProfile(content);
		setOptions(options);
		setCategory(Category.TEXT.getValue());
		setChannel(Channel.PUSH.getValue());
		setSilent(silent);
	}

}
