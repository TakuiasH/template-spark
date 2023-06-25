package dev.takuiash.api.utils.web.response;

import dev.takuiash.api.utils.web.Status;

public class ApiResponse extends ResponseObject {

	public boolean ok;
	public Status status;
	public Object[] data;
	
	public ApiResponse(boolean ok, Status status, Object... data) {
		this.ok = ok;
		this.status = status;
		this.data = data;
	}
	
	public ApiResponse putData(Object... data) {
		this.data = data;
		return this;
	}
	
}
