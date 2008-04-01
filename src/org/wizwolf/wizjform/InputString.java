package org.wizwolf.wizjform;

//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public final class InputString extends JTextField implements Input {

	public InputString() {
		super();		
	}

	public Object getValue() {		
		return super.getText();
	}

	public void setValue(final Object value) {		
		super.setText(value.toString());
	}
	
}
