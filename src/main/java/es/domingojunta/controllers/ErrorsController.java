package es.domingojunta.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpStatusCodeException;

@RestControllerAdvice
public class ErrorsController {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity showINternalServerError() {
		
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
