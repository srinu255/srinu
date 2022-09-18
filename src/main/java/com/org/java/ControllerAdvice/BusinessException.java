package com.org.java.ControllerAdvice;

import org.springframework.stereotype.Component;

@Component
public class BusinessException extends RuntimeException {
	
	public BusinessException(int errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}


	private int errorCode;
	private String errorMessage;
	
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	

	@Override
	public String toString() {
		return "BusinessException [errorCode=" + errorCode + ", errorMessage=" + errorMessage + "]";
	}
	public BusinessException(){
		
	}
}
