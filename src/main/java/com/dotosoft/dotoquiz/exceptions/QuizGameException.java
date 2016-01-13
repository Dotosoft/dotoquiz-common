package com.dotosoft.dotoquiz.exceptions;

public class QuizGameException extends Exception {
	private String errorMessageCode;
	private String errorMessageName;
	private String[] errorMessageParams;
	
	public QuizGameException(String errorCode, String... params) {
		this.errorMessageCode = errorCode;
		this.errorMessageParams = params;
	}
}
