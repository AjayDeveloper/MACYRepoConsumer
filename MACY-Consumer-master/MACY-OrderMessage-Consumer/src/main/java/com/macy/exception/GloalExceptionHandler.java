package com.macy.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GloalExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(value = { SaveToDatabaseException.class })
	public ResponseEntity<Object> handleSaveToDatabaseException(RuntimeException exception, WebRequest webRequest) {
		return handleExceptionInternal(exception, exception.toString(), new HttpHeaders(), HttpStatus.BAD_REQUEST,
				webRequest);
	}

	@ExceptionHandler(value = { DataParseException.class })
	public ResponseEntity<Object> handleDataParseException(RuntimeException exception, WebRequest webRequest) {
		return handleExceptionInternal(exception, exception.toString(), new HttpHeaders(), HttpStatus.BAD_REQUEST,
				webRequest);
	}

}
