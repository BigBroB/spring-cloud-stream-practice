package yeehaw.message.main.message.e;

public enum Channel {

	PUSH("P"), SMS("S");

	Channel(String channel) {
		this.setValue(channel);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	private String value;

}
