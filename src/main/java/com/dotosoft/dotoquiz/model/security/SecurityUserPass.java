package com.dotosoft.dotoquiz.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sec_user_pass", catalog = "dotoquiz")
public class SecurityUserPass implements java.io.Serializable {

	@Id
	protected String userId;

	@OneToOne
	protected SecurityUser secUser;

	@Column(name = "register_ip", length = 100)
	protected String registerIp;

	@Column(name = "refresh_token", length = 50)
	protected String refreshToken;

	@Column(name = "oauth_id", length = 50)
	protected String oauthId;

	@Column(name = "oauth_type", length = 50)
	protected String oauthType;

	public SecurityUserPass() {
	}

	public SecurityUserPass(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public SecurityUserPass(SecurityUser secUser, String oauthType,
			String oauthId, String refreshToken, String registerIp) {
		this.secUser = secUser;
		this.oauthType = oauthType;
		this.oauthId = oauthId;
		this.refreshToken = refreshToken;
		this.registerIp = registerIp;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public SecurityUser getSecUser() {
		return secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public String getRegisterIp() {
		return registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

	public String getRefreshToken() {
		return refreshToken;
	}

	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}

	public String getOauthId() {
		return oauthId;
	}

	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}

	public String getOauthType() {
		return oauthType;
	}

	public void setOauthType(String oauthType) {
		this.oauthType = oauthType;
	}

	@Override
	public String toString() {
		return "SecurityUserPass [userId=" + userId + ", secUser=" + secUser
				+ ", registerIp=" + registerIp + ", refreshToken="
				+ refreshToken + ", oauthId=" + oauthId + ", oauthType="
				+ oauthType + "]";
	}

}
