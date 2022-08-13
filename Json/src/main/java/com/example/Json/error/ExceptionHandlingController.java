package com.example.Json.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.Json.service.ResourceNotFoundException;

@ControllerAdvice

public class ExceptionHandlingController {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<Object> exception(ResourceNotFoundException exception) {
		return new ResponseEntity<>("Employee not exist with id:", HttpStatus.NOT_FOUND);
	}

}
