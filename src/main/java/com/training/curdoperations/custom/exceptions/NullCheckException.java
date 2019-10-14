package com.training.curdoperations.custom.exceptions;

public class NullCheckException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String errorMesssage;

	public String getErrorMesssage() {
		return errorMesssage;
	}

	public void setErrorMesssage(String errorMesssage) {
		this.errorMesssage = errorMesssage;
	}

	public NullCheckException(String errorMesssage) {
		super();
		this.errorMesssage = errorMesssage;
	}
	
	

}
