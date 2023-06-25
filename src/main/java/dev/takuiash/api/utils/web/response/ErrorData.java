package dev.takuiash.api.utils.web.response;

public class ErrorData {

	public ErrorType error_type;
	public String message;

	public ErrorData(ErrorType error_type, String message) {
		this.error_type = error_type;
		this.message = message;
	}
	
	public enum ErrorType {
		MISSING_PARAMETER,
		CONFLICT,
		NOT_FOUND
	}
}
