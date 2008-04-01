package org.wizwolf.wizjform;

import javax.swing.*;

@SuppressWarnings("serial")
public class FormDialog extends JFrame {
	@SuppressWarnings("unused")
	private FormModel formModel;
	private FormView formView;
	
	public FormDialog(FormModel formModel)
	{
		this.formModel = formModel;
		this.formView = FormViewFactory.Create(formModel);
		//Lay out the panel.
	    
		SpringUtilities.makeCompactGrid(this.formView, this.formView.getInputs().size(), 2, //rows, cols
	        6, 6, //initX, initY
	        6, 6); //xPad, yPad
	    
		this.getContentPane().add(this.formView);
	}
}
