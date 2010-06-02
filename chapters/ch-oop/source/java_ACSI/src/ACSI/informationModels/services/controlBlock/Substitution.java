/**
 * Supports replacement of a process value by another value.
 * @category IEC 61850 parte 7-2 (2003)
 * p�gina 18, cl�usula 5.3 , p�rrafo
 * 
 * @author David P�rez
 */
package ACSI.informationModels.services.controlBlock;

public abstract class Substitution {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 12.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetDataValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 12.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetDataValues();
}
//TODO no usado
