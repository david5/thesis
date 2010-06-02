/**
 *  Describe  the  conditions  for generating  logs  based  on  
 *  parameters  set  by  the  client.  Logs  can  be  queried  for  
 *  later  retrieval. 
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 19, cl�usula 5.3 , p�rrafo
 *  
 *  @see REPORT_CONTROL_BLOCK
 *  
 * @author David Perez
 */
package ACSI.informationModels.services.controlBlock;

/*
 * El nombre en may�scula de esta clase la obtuve de [7-2, clause 5.3, pp 19]
 * y el gui�n bajo _ lo uso en vez del gui�n - porque java no permite guion - 
 */
public abstract class LOG_CONTROL_BLOCK extends REPORT_CONTROL_BLOCK {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetLCBValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetLCBValues();
	
	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void QueryLogByTime();

	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void QueryLogAfterTime();
	
	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 14.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetLogStatusValues();
	
}
//TODO no usado