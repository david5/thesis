/**
 * The SERVER class represents the external visible behaviour of 
 * a device. All other ACSI models are part of the server.
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 17, cl�usula 5.2 , p�rrafo
 * 
 * @author David P�rez
 *
 */

public abstract class SERVER_interface {

	private String[] ServiceAccessPoint;
	
	public String[] getServiceAccessPoint() {
		return ServiceAccessPoint;
	}
	public void setServiceAccessPoint(String[] serviceAccessPoint) {
		ServiceAccessPoint = serviceAccessPoint;
	}
	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1
	 * Explicado en la cl�usula 6.
	 */
	public abstract String GetServerDirectory(String param);
}