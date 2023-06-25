package dev.takuiash.api.utils.web.response;

import java.util.ArrayList;
import java.util.List;

import dev.takuiash.api.utils.web.response.ErrorData.ErrorType;
import spark.Response;

public class Validator {
		
	private List<ErrorData> errors = new ArrayList<>();
		
	public void addError(ErrorType type, String message) {
		this.errors.add(new ErrorData(type, message));
	}
		
	public boolean containsError() {
		return !this.errors.isEmpty();
	}
		
	public Object validate(Response res) {
		return new ResponseBuilder(errors).internalServerError(res);
	}
	
}