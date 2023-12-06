package com.springrest.rest.exceptionHandler;

public class NoDataForGivenIDFoundException extends RuntimeException {
	private String message = "No data found for given id";
	
	public NoDataForGivenIDFoundException() {
		// TODO Auto-generated constructor stub
	}
	public NoDataForGivenIDFoundException(String message) {
		this.message = message;       ///custome exception
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}
