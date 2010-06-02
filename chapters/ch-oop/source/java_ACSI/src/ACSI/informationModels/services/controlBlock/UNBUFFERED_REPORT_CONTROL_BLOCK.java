/**
 * @see BUFFERED_REPORT_CONTROL_BLOCK
 */
package ACSI.informationModels.services.controlBlock;

public abstract class UNBUFFERED_REPORT_CONTROL_BLOCK extends REPORT_CONTROL_BLOCK {
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void Report();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetURCBValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetURCBValues();
}
//TODO no usado