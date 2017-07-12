package hk.judiciary.icmsint.model.sysinf.dao;

import hk.judiciary.icmsint.model.sysinf.enumObj.ReturnStatus;

public class DAOException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String entityName;
	private ReturnStatus status;

	public DAOException(String entityName) {
		this.entityName=entityName;
	}
	
	public DAOException(String entityName, ReturnStatus status ) {
		super(status.toString());
		this.entityName=entityName;
		this.status=status;
	}
	
	public String getEntityName() {
		return this.entityName;
	}
	public ReturnStatus getStatus() {
		return status;
	}


}
