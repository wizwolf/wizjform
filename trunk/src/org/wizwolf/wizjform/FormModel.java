package org.wizwolf.wizjform;

import java.util.*;

public class FormModel {
	
	private List<DataField> dataFields;

	public FormModel()
	{
		setDataFields(new ArrayList<DataField>());
	}

	public void setDataFields(List<DataField> dataFields) {
		this.dataFields = dataFields;
	}

	@SuppressWarnings("unused")
	public List<DataField> getDataFields() {
		return this.dataFields;
	}
	
	
	
}
