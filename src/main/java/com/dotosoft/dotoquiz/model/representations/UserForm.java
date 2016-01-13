package com.dotosoft.dotoquiz.model.representations;

public class UserForm {
	private String username;
	private String imageURL;
	private String country;
	private String registerIP;
	private String oauthType;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getRegisterIP() {
		return registerIP;
	}

	public void setRegisterIP(String registerIP) {
		this.registerIP = registerIP;
	}

	public String getOauthType() {
		return oauthType;
	}

	public void setOauthType(String oauthType) {
		this.oauthType = oauthType;
	}

	@Override
	public String toString() {
		return "UserForm [username=" + username + ", imageURL=" + imageURL
				+ ", country=" + country + ", registerIP=" + registerIP
				+ ", oauthType=" + oauthType + "]";
	}

}
