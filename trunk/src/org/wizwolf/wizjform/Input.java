package org.wizwolf.wizjform;

/**
 *  WizJForm input widget interface
 *
 *  @author     GuangZhe Song
 *  @version    $Id: Input.java,v 0.1 2008/03/25 10:52:24  $
 */

public interface Input {
	/**
	 *	Get DataField Name
	 * 	@return DataField name
	 */
	public String getName();

	/**
	 *	Set DataField Name
	 * 	@param DataField name
	 */
	public void setName(String dataField);
	
	/**
	 *	Set Input to value
	 *  @param value value of the Input
	 */
	public void setValue (Object value);

	/**
	 *	Return Input value
	 *  @return current value
	 */
	public Object getValue();
	
}
