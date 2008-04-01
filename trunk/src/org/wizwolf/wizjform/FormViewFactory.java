package org.wizwolf.wizjform;

public class FormViewFactory {

	public static FormView Create(FormModel formModel)
	{
		FormView view = new FormView();
		for(int i = 0; i < formModel.getDataFields().size();i++){
			Input input = InputFactory.Create(formModel.getDataFields().get(i));
			view.Add(input);
		}
		return view;
	}	
}
