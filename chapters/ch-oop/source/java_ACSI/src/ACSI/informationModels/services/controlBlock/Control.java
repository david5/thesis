/**
 * Describes the services to control, for example, devices 
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 19, cl�usula 5.3 , p�rrafo
 *  
 * @author David Perez
 *
 */

package ACSI.informationModels.services.controlBlock;

public abstract class Control {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Select();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SelectWithValue();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Cancel();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Operate();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void CommandTermination();
	

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 17.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void TimeActivatedOperate();

}
//TODO no usado