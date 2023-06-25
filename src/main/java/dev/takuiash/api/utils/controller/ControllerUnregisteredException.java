package dev.takuiash.api.utils.controller;

public class ControllerUnregisteredException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2578558846924519387L;

	public ControllerUnregisteredException(String controllerName) {
		super("controller '" + controllerName + "' is not registered");
	}
	
	
}
