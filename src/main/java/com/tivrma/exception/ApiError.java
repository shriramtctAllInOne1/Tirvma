package com.tivrma.exception;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.ObjectError;

public class ApiError {

	private HttpStatus status;
	private String message;
	private List<ObjectError> errors;

	public ApiError(HttpStatus badRequest, String message, List<ObjectError> list) {
		super();
		this.status = badRequest;
		this.message = message;
		this.errors = list;
	}
	
	public ApiError(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}


	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<ObjectError> getErrors() {
		return errors;
	}

	public void setErrors(List<ObjectError> errors) {
		this.errors = errors;
	}

	
	
	
}