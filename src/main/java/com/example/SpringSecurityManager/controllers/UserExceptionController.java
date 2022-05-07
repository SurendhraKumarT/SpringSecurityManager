package com.example.SpringSecurityManager.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.SpringSecurityManager.exception.UserNotFoundException;



@ControllerAdvice
public class UserExceptionController {
	private UserNotFoundException exception;

	@ExceptionHandler(value = UserNotFoundException.class)
    public ResponseEntity<Object> exception(UserNotFoundException exception) {
       this.exception = exception;
	return new ResponseEntity<>("User not found", HttpStatus.NOT_FOUND);
    }
}