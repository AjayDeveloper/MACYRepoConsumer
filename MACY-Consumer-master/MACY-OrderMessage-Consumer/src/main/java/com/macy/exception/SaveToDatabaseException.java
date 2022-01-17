package com.macy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class SaveToDatabaseException extends RuntimeException {

	private String message;

	public SaveToDatabaseException() {
		super();
		this.message = "";
	}

	public SaveToDatabaseException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "Error to save data in DB";
	}
}
