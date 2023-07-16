package com.MyHospital.One.HExceptionHandlers;

public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException() {
		super("Resource not found in the DataBase");
	}
}
