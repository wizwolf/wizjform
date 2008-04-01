package org.wizwolf.wizjform;


public class InputFactory {

	public static Input Create(DataField dataField) {
		Input input = null;
		String type = dataField.getType();
		if (type == "number") {
			input = new InputNumber();
			input.setName(dataField.getName());
		}
		if (type == "string") {
			input = new InputString();
			input.setName(dataField.getName());
		}
		if (type == "date") {
			input = new InputDate();
			input.setName(dataField.getName());
		}
		
		return input;
	}	
}
