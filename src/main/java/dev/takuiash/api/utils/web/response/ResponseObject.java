package dev.takuiash.api.utils.web.response;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class ResponseObject {

	@Override
	public String toString() {		
		try {
			return new ObjectMapper().writeValueAsString(this);
		} catch (JsonProcessingException e) {
            throw new RuntimeException("IOEXception while mapping object (" + this + ") to JSON");
		}
	}
	
}
