package dev.takuiash.api.utils.controller;

import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.reflections.Reflections;

import dev.takuiash.api.v1.Main;

public class Controllers {

	private static final Map<String, Object> controllers = new HashMap<>();

	public static void registerControllers() {				
		Reflections ref = new Reflections(Main.getProperty("API_PACKAGE"));
		
		for(Class<?> c : ref.getTypesAnnotatedWith(Controller.class)) {
			try {
				Object controller =  c.getConstructor().newInstance();
				Controller annotation = c.getAnnotation(Controller.class);

				if(annotation.value() == null || annotation.value().isBlank())
					throw new IllegalArgumentException("the annotation 'controller' value can't be empty.");
				
				if(controllers.containsKey(annotation.value()))
					throw new RuntimeException("duplicated annotation value in classes '" + controllers.get(annotation.value()).getClass().getName() + "' and '" + c.getName() + "'");
				
				controllers.put(annotation.value(), controller);
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T get(String name) {
		if(!Controllers.controllers.containsKey(name))
			throw new ControllerUnregisteredException(name);
		
		return (T) Controllers.controllers.get(name);
	}
	
	public Map<String, Object> all() {
		return Collections.unmodifiableMap(controllers);
	}
	
}
