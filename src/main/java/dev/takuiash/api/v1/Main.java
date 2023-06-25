package dev.takuiash.api.v1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import dev.takuiash.api.utils.Filters;
import dev.takuiash.api.utils.controller.Controllers;
import spark.Spark;
import spark.debug.DebugScreen;

public class Main {
    private static final Properties properties = new Properties();

	public static void main(String[] args) throws FileNotFoundException, IOException {		
		properties.load(new FileReader("application.properties"));

		Spark.port(8080);
		
		DebugScreen.enableDebugScreen();
		
		Spark.before("*", Filters.loadBefore);
		Controllers.registerControllers();
		Spark.after("*", Filters.loadAfter);
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
}
