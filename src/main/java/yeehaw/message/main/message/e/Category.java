package yeehaw.message.main.message.e;

/**
 * 
 * 
 * 
 *
 */
public enum Category {

	/**
	 * 短信随机码
	 */
	RANDOM("random"),
	/**
	 * 普通文本
	 */
	TEXT("text"),
	/**
	 * 任务消息
	 */
	TASK("task"),
	/**
	 * 首页信息
	 */
	HOME("home"),
	/**
	 * 站内信
	 */
	MAIL("mail"),
	/**
	 * 广告
	 */
	ADVERTISING("advertising");

	Category(String value) {
		this.setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String value;

}
