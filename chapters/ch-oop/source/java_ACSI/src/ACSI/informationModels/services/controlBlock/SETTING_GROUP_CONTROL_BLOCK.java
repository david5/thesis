/**
 * Defines  how  to  switch  from  one  set  of  setting
 * values to another one and how to edit setting groups
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 18, cl�usula 5.3 , p�rrafo
 *  
 * @author David Perez
 */
package ACSI.informationModels.services.controlBlock;

import ACSI.informationModels.ACSIClass;

/*
 * El nombre en may�scula de esta clase la obtuve de [7-2, clause 5.3, pp 18]
 * y el gui�n bajo _ lo uso en vez del gui�n - porque java no permite guion - 
 */
public abstract class SETTING_GROUP_CONTROL_BLOCK extends ACSIClass{

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SelectActiveSG();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SelectEditSG();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetSGValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void ConfirmEditSGValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetSGValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 13.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetSGCBValues();
}
//TODO no usado