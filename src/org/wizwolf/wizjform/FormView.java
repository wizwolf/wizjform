package org.wizwolf.wizjform;

import java.util.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class FormView extends JPanel{	
	private SpringLayout layout;
	private List<Input> inputs;
	
	public FormView() {		
		layout = new SpringLayout();
		this.setLayout(layout);
		this.inputs = new ArrayList<Input>();
	}
	
	public void Add(Input input) {		
		JLabel label = new JLabel(input.getName(), JLabel.TRAILING);
		this.add(label);
		JComponent inputWidget = (JComponent)input;
		label.setLabelFor(inputWidget);		
		this.add(inputWidget);
		this.inputs.add(input);
	}

	@SuppressWarnings("unused")
	public void setInputs(final List<Input> inputs) {
		this.inputs = inputs;
	}

	@SuppressWarnings("unused")
	public List<Input> getInputs() {
		return this.inputs;
	}
}
