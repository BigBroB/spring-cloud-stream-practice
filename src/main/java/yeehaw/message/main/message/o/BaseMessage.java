package yeehaw.message.main.message.o;

import java.io.Serializable;
import java.util.Map;

import yeehaw.message.main.message.e.Channel;

@SuppressWarnings("serial")
public class BaseMessage implements IMessage, Serializable {

	/**
	 * 原系统流水号
	 */
	private String sourceSN;
	/**
	 * 信息来源
	 */
	private String source;

	/**
	 * 信息接收对象列表
	 */
	private String[] targets;

	/**
	 * 标题
	 */

	private String title;
	/**
	 * 简介
	 */
	private String profile;
	/**
	 * 回调
	 */
	private String callbackUrl;
	/**
	 * 附件
	 * 
	 */
	private Map<String, String> options;

	/**
	 * 是否显示通知栏 false 显示（默认）
	 */
	private boolean silent = false;
	/**
	 * 通道
	 */
	private String channel = Channel.PUSH.getValue();

	/**
	 * 类型
	 */
	private String category;

	public BaseMessage() {
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public void setTargets(String[] targets) {
		this.targets = targets;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceSN() {
		return sourceSN;
	}

	public void setSourceSN(String sourceSN) {
		this.sourceSN = sourceSN;
	}

	@Override
	public String[] getTargets() {
		return targets;
	}

	public Map<String, String> getOptions() {
		return options;
	}

	public void setOptions(Map<String, String> options) {
		this.options = options;
	}

	@Override
	public String getCategory() {
		return category;
	}

	public String getChannel() {
		return channel;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}
 

	public boolean isSilent() {
		return silent;
	}

	public void setSilent(boolean silent) {
		this.silent = silent;
	}

}