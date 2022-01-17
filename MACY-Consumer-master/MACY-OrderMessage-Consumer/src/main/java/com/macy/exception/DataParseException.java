package com.macy.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DataParseException extends RuntimeException {

	  private String message;
	  
	    
	    public DataParseException() {
	        super();
	        this.message = "";
	    }

	    public DataParseException(String message) {
	        super();
	        this.message = message;
	    }
	 
	    @Override
	    public String toString() {
	        return "Error in parsing the data";
	    }
}
