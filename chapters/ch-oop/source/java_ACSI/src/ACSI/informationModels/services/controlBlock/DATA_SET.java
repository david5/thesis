/**
 *  permits the grouping of data and data attributes. 
 *  Used for direct access and for reporting and logging
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 18, cl�usula 5.3 , p�rrafo
 *
 *  
 */

package ACSI.informationModels.services.controlBlock;

import ACSI.informationModels.ACSIClass;

/*
 * El nombre en may�scula de esta clase la obtuve de [7-2, clause 5.3, pp 18]
 * y el gui�n bajo _ lo uso en vez del gui�n - porque java no permite guion - 
 */
public abstract class DATA_SET extends ACSIClass {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataSetValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetDataSetValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void CreateDataSet();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void DeleteDataSet();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 11.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataSetDirectory();

}
//TODO no usado