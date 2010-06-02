/**
 *  control  blocks  for  transmission  of  sampled  values  �  fast  and  cyclic  transfer  of
 *  samples, for example, of instrument transformers.
 *  
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 19, cl�usula 5.2 , p�rrafo
 *  
 *  @see UNICAST_SAMPLE_VALUE_CONTROL_BLOCK
 */


package ACSI.informationModels.services.controlBlock;

/*
 * version 01
 * El nombre en may�scula de esta clase la obtuve de [7-2, clause 5.3, pp 19]
 * y el gui�n bajo _ lo uso en vez del gui�n - porque java no permite guion -
 * 
 * version 02
 * y luego lo renombr� acorde a [7-2, clause 5.4, pp 21] 
 */
public abstract class MULTICAST_SAMPLE_VALUE_CONTROL_BLOCK extends
		SAMPLE_VALUE_CONTROL_BLOCK {

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 16.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SendMSVMessage();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 16.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void GetMSVCBValues();

	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 16.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void SetMSVCBValues();
	
}
//TODO no usado