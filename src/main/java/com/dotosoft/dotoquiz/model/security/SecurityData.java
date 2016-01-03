package com.dotosoft.dotoquiz.model.security;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.parameter.ParameterCountry;

@Entity
@Table(name="sec_data", catalog="dotoquiz")
public class SecurityData implements java.io.Serializable {

	@Id
	@Column(name = "id", unique = true, nullable = false)
	protected String id;
	
	@ManyToOne
	protected ParameterCountry mtCountry;
	
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
	
	@OneToOne
	@JoinColumn(name = "id")
	protected SecurityUser securityUser;

	public SecurityData() {
	}

	public SecurityData(SecurityUser securityUser) {
		this.securityUser = securityUser;
	}

	public SecurityData(ParameterCountry mtCountry, SecurityUser securityUser, String username,
			String imageUrl, String title, Integer level, Long exp) {
		this.mtCountry = mtCountry;
		this.securityUser = securityUser;
		this.username = username;
		this.imageUrl = imageUrl;
		this.title = title;
		this.level = level;
		this.exp = exp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ParameterCountry getMtCountry() {
		return this.mtCountry;
	}

	public void setMtCountry(ParameterCountry mtCountry) {
		this.mtCountry = mtCountry;
	}

	public SecurityUser getSecurityUser() {
		return this.securityUser;
	}

	public void setSecurityUser(SecurityUser securityUser) {
		this.securityUser = securityUser;
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
