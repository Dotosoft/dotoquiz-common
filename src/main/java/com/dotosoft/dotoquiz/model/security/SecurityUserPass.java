package com.dotosoft.dotoquiz.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="sec_user_pass", catalog="dotoquiz")
public class SecurityUserPass implements java.io.Serializable {

	@Id
	protected String userId;
	
	@OneToOne
	protected SecurityUser secUser;
	
	@Column(name="oauth_type", length=45)
	protected String oauthType;
	
	@Column(name="oauth_id", length=45)
	protected String oauthId;
	
	@Column(name="oauth_secret", length=45)
	protected String oauthSecret;
	
	@Column(name="register_ip", length=100)
	protected String registerIp;

	public SecurityUserPass() {
	}

	public SecurityUserPass(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public SecurityUserPass(SecurityUser secUser, String oauthType, String oauthId,
			String oauthSecret, String registerIp) {
		this.secUser = secUser;
		this.oauthType = oauthType;
		this.oauthId = oauthId;
		this.oauthSecret = oauthSecret;
		this.registerIp = registerIp;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public SecurityUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public String getOauthType() {
		return this.oauthType;
	}

	public void setOauthType(String oauthType) {
		this.oauthType = oauthType;
	}

	public String getOauthId() {
		return this.oauthId;
	}

	public void setOauthId(String oauthId) {
		this.oauthId = oauthId;
	}

	public String getOauthSecret() {
		return this.oauthSecret;
	}

	public void setOauthSecret(String oauthSecret) {
		this.oauthSecret = oauthSecret;
	}

	public String getRegisterIp() {
		return this.registerIp;
	}

	public void setRegisterIp(String registerIp) {
		this.registerIp = registerIp;
	}

}
