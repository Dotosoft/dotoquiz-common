package com.dotosoft.dotoquiz.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "sec_user_pass", catalog = "dotoquiz")
public class SecurityUserPass implements java.io.Serializable {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	protected String id;
	
	@OneToOne
	@JoinColumn(name = "id")
	protected SecurityUser securityUser;

	@Column(name = "register_ip", length = 100)
	protected String registerIp;

	@Column(name = "refresh_token", length = 50)
	protected String refreshToken;

	@Column(name = "oauth_type", length = 50)
	protected String oauthType;

	public SecurityUserPass() {
	}

	public SecurityUserPass(SecurityUser securityUser) {
		this.securityUser = securityUser;
	}

	public SecurityUserPass(SecurityUser securityUser, String oauthType,
			String refreshToken, String registerIp) {
		this.securityUser = securityUser;
		this.oauthType = oauthType;
		this.refreshToken = refreshToken;
		this.registerIp = registerIp;
	}

	public String getId() {
		return id;
	}

	public void setUserId(String id) {
		this.id = id;
	}

	public SecurityUser getSecurityUser() {
		return securityUser;
	}

	public void setSecurityUser(SecurityUser securityUser) {
		this.securityUser = securityUser;
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

	public String getOauthType() {
		return oauthType;
	}

	public void setOauthType(String oauthType) {
		this.oauthType = oauthType;
	}

	@Override
	public String toString() {
		return "SecurityUserPass [id=" + id + ", securityUser=" + securityUser
				+ ", registerIp=" + registerIp + ", refreshToken="
				+ refreshToken + ", oauthType=" + oauthType + "]";
	}

}
