package com.org.java.ControllerAdvice;

public class EmptyException extends RuntimeException {
	public EmptyException(int errorCode, String errorMessages) {
		super();
		this.errorCode = errorCode;
		this.errorMessages = errorMessages;
	}
	@Override
	public String toString() {
		return "EmptyException [errorCode=" + errorCode + ", errorMessages=" + errorMessages + "]";
	}
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(String errorMessages) {
		this.errorMessages = errorMessages;
	}
	private int errorCode;
	private String errorMessages;
public EmptyException(){
	
}
}
