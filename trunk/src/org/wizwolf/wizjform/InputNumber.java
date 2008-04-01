package org.wizwolf.wizjform;

import javax.swing.*;

@SuppressWarnings("serial")
public class InputNumber extends JSpinner implements Input {
	
	public InputNumber() {
		SpinnerModel model = new SpinnerNumberModel();
		super.createEditor(model);
	}
	
	public Object getValue() {
		return super.getValue();
	}
	
	public void setValue(final Object value) {
		super.setValue(value);
	}
}
