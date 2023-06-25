package dev.takuiash.api.utils;

import spark.*;

public class Filters {

    public static Filter loadBefore = (Request request, Response response) -> {    	
        /*if (!request.pathInfo().endsWith("/")) {
            response.redirect(request.pathInfo() + "/");
        }*/
    };
    
    public static Filter loadAfter = (Request request, Response response) -> {
    	response.header("Content-Type", "application/json");
    };
}