/**
 *  Provides the time base for the device and system 
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 19, cl�usula 5.3 , p�rrafo
 *  
 * @author David Perez
 *
 */

package ACSI.informationModels.services.controlBlock;

public abstract class Time {
	
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 18.
	 */
	//TODO cambiar el void por su correspondiente
	public abstract void TimeSynchronization();

}
//TODO no usado