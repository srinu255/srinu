package com.org.java.ControllerAdvice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerAdvice {
	
	@ExceptionHandler(BusinessException.class)
	public ResponseEntity<String> handleBusinessException(BusinessException businessException){
		return new ResponseEntity("neku dandam ra babu correct id evvura nayana plese please..",HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(EmptyException.class)
	public ResponseEntity<String> handleEmptyException(EmptyException businessException){
		return new ResponseEntity("given name is Empty please check and Enter The Name Please..",HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException){
		return new ResponseEntity("given name is Empty please check and Enter The Name Please..",HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException(NullPointerException nullPointerException){
		return new ResponseEntity("given value is Null Please change the value give correct data",HttpStatus.BAD_REQUEST);
	}
}
