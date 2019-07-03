/**
 * The ResourceServer Project, BSD License,Copyright (c) 2019
 * All rights reserved.
**/
package com.tivrma.exception;

import org.json.JSONException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tivrma.util.CommonUtility;

@SuppressWarnings({ "unchecked", "rawtypes" })
@ControllerAdvice
public class CustomResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	/**
	 * Logger Object
	 */
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomResponseEntityExceptionHandler.class);

	@Autowired
	CommonUtility commonUtility;

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		LOGGER.debug("Entering CustomResponseEntityExceptionHandler.class handleAllExceptions()");
		String errorResponse=commonUtility.createErrorResponse("ErrorCode-300", ex.getLocalizedMessage());
		return new ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	

	@ExceptionHandler(JSONException.class)
	public final ResponseEntity<Object> handleJsonExceptions(CustomJsonException ex, WebRequest request) {
		LOGGER.debug("Entering CustomResponseEntityExceptionHandler.class handleAllExceptions()");
		String errorResponse=commonUtility.createErrorResponse(ex.getCode(),ex.getMsg());
		return new ResponseEntity(errorResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(TivrmaException.class)
	public final ResponseEntity<Object> handleRecordNotFoundException(TivrmaException ex, WebRequest request) {
		LOGGER.debug("Entering CustomResponseEntityExceptionHandler.class handleRecordNotFoundException()");
		return new ResponseEntity(ex.getLocalizedMessage(), HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		LOGGER.debug("Entering CustomResponseEntityExceptionHandler.class handleMethodArgumentNotValid()");
		String errorResponse=commonUtility.createErrorResponse("ErrorCode-301", ex.getLocalizedMessage());
		return new ResponseEntity(errorResponse, HttpStatus.BAD_REQUEST);
	}
}