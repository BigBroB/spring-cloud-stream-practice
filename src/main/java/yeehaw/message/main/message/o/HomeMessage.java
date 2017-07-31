package yeehaw.message.main.message.o;

import java.util.Map;

import yeehaw.message.main.message.e.Category;
import yeehaw.message.main.message.e.Channel;

@SuppressWarnings("serial")
public class HomeMessage extends BaseMessage {

	
	public HomeMessage(){
		setCategory(Category.HOME.getValue());
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
	 * @param model
	 *            模版（在信息中心存在的模版，需要预先创建）
	 * @param silent
	 *            是否静默信息
	 */
	public HomeMessage(String sourceMsgId, String source, String target, String title, String model, boolean silent) {

		this(sourceMsgId, source, new String[] { target }, title, null, null, model, silent);
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
	 * @param model
	 *            模版（在信息中心存在的模版，需要预先创建）
	 * @param silent
	 *            是否静默信息
	 */
	public HomeMessage(String sourceMsgId, String source, String target, String title, String content, String model,
			boolean silent) {
		this(sourceMsgId, source, new String[] { target }, title, content, null, model, silent);
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
	 * @param model
	 *            模版（在信息中心存在的模版，需要预先创建）
	 * @param silent
	 *            是否静默信息
	 */
	public HomeMessage(String sourceMsgId, String source, String[] targets, String title, String content,
			Map<String, String> options, String model, boolean silent) {
		setSourceSN(sourceMsgId);
		setSource(source);
		setTargets(targets);
		setTitle(title);
		setProfile(content);
		options.put("model", model);
		setOptions(options);
		setCategory(Category.HOME.getValue());
		setChannel(Channel.PUSH.getValue());
		setSilent(silent);

	}

	public String getModel() {
		if (getOptions() != null)
			return getOptions().get("model");
		return "";
	}

	public void setModel(String model) {
		if (getOptions() != null)
			getOptions().put("model", model);
	}

}
