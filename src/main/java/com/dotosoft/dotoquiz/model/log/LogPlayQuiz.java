package com.dotosoft.dotoquiz.model.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.data.DataTopics;
import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name = "log_playQuiz", catalog = "dotoquiz")
public class LogPlayQuiz implements java.io.Serializable {

	@Id
	protected String id;

	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser securityUser;

	@ManyToOne
	@JoinColumn(name = "gameId")
	protected LogGameCreated logGameCreated;

	@Column(name = "status", length = 100)
	protected String status;

	@Column(name = "reason", columnDefinition="TEXT")
	protected String reason;

	@Column(name = "points", columnDefinition="INTEGER")
	protected Integer points;

	public LogPlayQuiz() {
	}

	public LogPlayQuiz(String id) {
		this.id = id;
	}

	public LogPlayQuiz(String id, SecurityUser securityUser,
			LogGameCreated logGameCreated, Date playDate, String status,
			String reason, Integer points) {
		this.id = id;
		this.securityUser = securityUser;
		this.logGameCreated = logGameCreated;
		this.status = status;
		this.reason = reason;
		this.points = points;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SecurityUser getSecurityUser() {
		return this.securityUser;
	}

	public void setSecurityUser(SecurityUser securityUser) {
		this.securityUser = securityUser;
	}

	public LogGameCreated getLogGameCreated() {
		return logGameCreated;
	}

	public void setLogGameCreated(LogGameCreated logGameCreated) {
		this.logGameCreated = logGameCreated;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Integer getPoints() {
		return this.points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "LogPlayQuiz [id=" + id + ", securityUser=" + securityUser
				+ ", logGameCreated=" + logGameCreated + ", status=" + status
				+ ", reason=" + reason + ", points=" + points + "]";
	}

}
