package org.wizwolf.wizjform;

import javax.swing.*;

@SuppressWarnings("serial")
public class InputDate extends JSpinner implements Input {
	private String name;
	public InputDate() {
		SpinnerModel model = new SpinnerDateModel();
		super.setModel(model);
	}
	
	public Object getValue() {		
		return super.getValue();
	}
	
	public void setValue(Object value) {
		super.setValue(value);
	}
	
	public String getName() {		
		return this.name;
	}
	
	public void setName(String dataField) {		
		this.name = dataField;
	}
}
