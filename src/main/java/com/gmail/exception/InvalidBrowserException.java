package com.gmail.exception;

public class InvalidBrowserException extends Exception {
	
	private String msg;
	
	public InvalidBrowserException(String browserName) {
		this.msg="Invalid Browser Exception "+browserName;
	}
	
	
	@Override
	public String toString() {
		return msg;
	}

}
