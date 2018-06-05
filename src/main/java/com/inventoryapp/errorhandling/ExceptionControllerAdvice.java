package com.inventoryapp.errorhandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionControllerAdvice extends RuntimeException{

	
	public ResponseEntity<ErrorMessage> genericExceptionHander(Exception exception){
			ErrorMessage genericErrorMessage = new ErrorMessage();
			
			genericErrorMessage.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
			genericErrorMessage.setErrorMessage("Generic Exception: Sorry, we encountered some issues while "
					+ "handling your request");
			
			return new ResponseEntity<ErrorMessage>(genericErrorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	
	
}
	
	
