package com.dotosoft.dotoquiz.exceptions;

import com.dotosoft.dotoquiz.utils.LabelUtils;

public class QuizGameException extends Exception {
	private String errorMessageCode;
	private String[] errorMessageParams;
	private String errorMessageDisplay;

	public QuizGameException(String errorCode) {
		super(errorCode, null);
	}

	public QuizGameException(String errorCode, String... params) {
		this.errorMessageCode = errorCode;
		this.errorMessageParams = params;
		this.errorMessageDisplay = LabelUtils.getLabel(errorMessageCode,
				errorMessageParams);
	}

	@Override
	public String getMessage() {
		return errorMessageDisplay;
	}

	public String getErrorMessageCode() {
		return errorMessageCode;
	}

	public void setErrorMessageCode(String errorMessageCode) {
		this.errorMessageCode = errorMessageCode;
	}

	@Override
	public String toString() {
		return "Error: ".concat(errorMessageCode).concat(" - ")
				.concat(errorMessageDisplay);
	}
}
