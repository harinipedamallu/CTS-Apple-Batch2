package com.cts.training.reactiveapp.fiuxandmonotests;

public class CustomException extends Throwable{

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public CustomException(Throwable e) {
		this.message = e.getMessage();
	}
}
