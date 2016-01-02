package com.dotosoft.dotoquiz.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.parameter.ParameterCountry;

@Entity
@Table(name="sec_data", catalog="dotoquiz")
public class SecurityData implements java.io.Serializable {

	@Id
	protected String userid;
	
	@ManyToOne
	protected ParameterCountry mtCountry;
	
	@ManyToOne
	protected SecurityUser secUser;
	
	@Column(name="username", length=100)
	protected String username;
	
	@Column(name="image_url", length=200)
	protected String imageUrl;
	
	@Column(name="title", length=200)
	protected String title;
	
	@Column(name="level")
	protected Integer level;
	
	@Column(name="exp")
	protected Long exp;

	public SecurityData() {
	}

	public SecurityData(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public SecurityData(ParameterCountry mtCountry, SecurityUser secUser, String username,
			String imageUrl, String title, Integer level, Long exp) {
		this.mtCountry = mtCountry;
		this.secUser = secUser;
		this.username = username;
		this.imageUrl = imageUrl;
		this.title = title;
		this.level = level;
		this.exp = exp;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public ParameterCountry getMtCountry() {
		return this.mtCountry;
	}

	public void setMtCountry(ParameterCountry mtCountry) {
		this.mtCountry = mtCountry;
	}

	public SecurityUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getLevel() {
		return this.level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Long getExp() {
		return this.exp;
	}

	public void setExp(Long exp) {
		this.exp = exp;
	}

}
