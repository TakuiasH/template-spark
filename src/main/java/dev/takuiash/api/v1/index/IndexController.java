package dev.takuiash.api.v1.index;

import dev.takuiash.api.utils.controller.Controller;
import dev.takuiash.api.utils.web.response.ResponseBuilder;

import spark.Request;
import spark.Response;
import spark.Spark;
import spark.route.Routes;

@Controller("index")
public class IndexController extends Routes {

	public IndexController() {
		Spark.get("/", (req, res) -> index(req, res));
		Spark.get("*", (req, res) -> notFound(req, res));
	}

	public Object index(Request req, Response res) {
		return new ResponseBuilder("Hello World!").ok(res);
	}
	
	public Object notFound(Request req, Response res) {
		return new ResponseBuilder().notFound(res, "path '" + req.pathInfo() + "' not implemented.");
	}
	
}
