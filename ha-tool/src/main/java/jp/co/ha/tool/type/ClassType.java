package jp.co.ha.tool.type;

public enum ClassType {

	CLASS("class"),
	INTERFACE("interface"),
	ANNOTATION("@interface"),
	ENUM("enum");

	private ClassType(String value) {
		this.value = value;
	}

	private String value;

	public String getValue() {
		return this.value;
	}
}