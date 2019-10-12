package edu.ait.repserver.rest;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalControllerExceptionHandler {
	
	@ExceptionHandler(NoSuchElementException.class)
	ResponseEntity handleNoSuchElementException(NoSuchElementException ex) {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
}
