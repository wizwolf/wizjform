package org.wizwolf.wizjform;
import javax.swing.*;
public class WizJForm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataField d1 = new DataField();
		d1.setName("String");
		d1.setType("string");
		
		DataField d2 = new DataField();
		d2.setName("Number");
		d2.setType("number");
		
		DataField d3 = new DataField();
		d3.setName("Date");
		d3.setType("date");

		FormModel formModel = new FormModel();
		formModel.getDataFields().add(d1);
		formModel.getDataFields().add(d2);
		formModel.getDataFields().add(d3);
		
		FormDialog dialog = new FormDialog(formModel);	

		dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dialog.pack();
		dialog.setVisible(true);
		//dialog.show();


		//System.out.println("Hello World!");
	}

}
