/**
 *  contains the information produced and consumed by a group of
 *  domain-specific application functions; functions are defined as LOGICAL-NODEs
 *  @category IEC 61850 parte 7-2 (2003)
 *  p�gina 17, cl�usula 5.2 , p�rrafo
 */

package ACSI.informationModels;

import ACSI.informationModels.services.error.ServiceError;

/*
 * El nombre en may�scula de esta clase la obtuve de [7-2, clause 5.3, pp 17]
 * y el gui�n bajo _ lo uso en vez del gui�n - porque java no permite guion - 
 */
public abstract class LOGICAL_DEVICE {

	
	/**
	 * Instance name of an instance of LOGICALDEVICE.
	 * 
	 * Shall unambiguously identify a LOGICAL-DEVICE 
	 * within the scope of a system.
	 * 
	 * The LOGICAL-DEVICE is the root of tree. Therefore 
	 * the LDName and LDRef are identical. For conceptual
	 * reasons they are both included in the table. 
	 */
	private String LDName;
	
	
	/**
	 * Path-name of an instance of LOGICALDEVICE.
	 * 
	 * Shall be the unique path-name of a LOGICAL-DEVICE.
	 * 
	 * The LOGICAL-DEVICE is the root of tree. Therefore 
	 * the LDName and LDRef are identical. For conceptual
	 * reasons they are both included in the table. 
	 */
	private String LDRef;
	
	
	/**
	 * IEC 61850-7-4 specifies specialized classes
	 * of LOGICAL-NODE
	 */
	private LOGICAL_NODE[] LogicalNode;
	
	
	
	public String getLDName() {
		return LDName;
	}



	public void setLDName(String name) {
		LDName = name;
	}



	public String getLDRef() {
		return LDRef;
	}



	public void setLDRef(String ref) {
		LDRef = ref;
	}



	public LOGICAL_NODE[] getLogicalNode() {
		return LogicalNode;
	}



	public void setLogicalNode(LOGICAL_NODE[] logicalNode) {
		LogicalNode = logicalNode;
	}


	/**
	 * Definido en IEC 61850 parte 7-2 (2003)
	 * p�gina 21, cl�usula 5.4, tabla 1 <br>
	 * Explicado en la cl�usula 8.
	 */
	public abstract LOGICAL_NODE[] GetLogicalDeviceDirectory(
			LOGICAL_DEVICE Request) throws ServiceError;
}

//TODO no usado