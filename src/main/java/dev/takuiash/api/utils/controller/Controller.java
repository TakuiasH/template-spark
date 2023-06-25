package dev.takuiash.api.utils.controller;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
	
	/**
	 * @return name of controller.
	 */
	public String value();
	
}
