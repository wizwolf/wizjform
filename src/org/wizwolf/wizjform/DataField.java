package org.wizwolf.wizjform;

public class DataField {

	private String name;
	
	private Object value;
	
	private String type;

	@SuppressWarnings("unused")
	public void setName(final String name) {
		this.name = name;
	}

	@SuppressWarnings("unused")
	public String getName() {
		return this.name;
	}

	@SuppressWarnings("unused")
	public void setValue(final Object value) {
		this.value = value;
	}

	@SuppressWarnings("unused")
	public Object getValue() {
		return this.value;
	}

	@SuppressWarnings("unused")
	public void setType(final String type) {
		this.type = type;
	}

	@SuppressWarnings("unused")
	public String getType() {
		return this.type;
	}
}
