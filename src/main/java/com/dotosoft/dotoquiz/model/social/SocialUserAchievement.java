package com.dotosoft.dotoquiz.model.social;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.parameter.ParameterAchievements;
import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="sos_user_achievement", catalog="dotoquiz")
public class SocialUserAchievement implements java.io.Serializable {

	@Id
	protected String id;
	
	@ManyToOne
	protected ParameterAchievements mtAchievements;
	
	@ManyToOne
	protected SecurityUser secUser;
	
	@Column(name="created_dt", length=19)
	protected Date createdDt;

	public SocialUserAchievement() {
	}

	public SocialUserAchievement(String id) {
		this.id = id;
	}

	public SocialUserAchievement(String id, ParameterAchievements mtAchievements,
			SecurityUser secUser, Date createdDt) {
		this.id = id;
		this.mtAchievements = mtAchievements;
		this.secUser = secUser;
		this.createdDt = createdDt;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ParameterAchievements getMtAchievements() {
		return this.mtAchievements;
	}

	public void setMtAchievements(ParameterAchievements mtAchievements) {
		this.mtAchievements = mtAchievements;
	}

	public SecurityUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public Date getCreatedDt() {
		return this.createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

}
