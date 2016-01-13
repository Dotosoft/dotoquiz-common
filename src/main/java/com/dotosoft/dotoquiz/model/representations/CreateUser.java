package com.dotosoft.dotoquiz.model.representations;

public class CreateUser {
	
	public CreateUser() {}
	
	public CreateUser(String userId, String sessionToken) {
		this.userId = userId;
		this.sessionToken = sessionToken;
	}

	protected String userId;
	protected String sessionToken;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}

	@Override
	public String toString() {
		return "CreateUser [userId=" + userId + ", sessionToken="
				+ sessionToken + "]";
	}

}
