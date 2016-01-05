package com.dotosoft.dotoquiz.model.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name = "log_stepPlay", catalog = "dotoquiz")
public class LogStepPlay {
	@Id
	protected String id;

	@ManyToOne
	@JoinColumn(name = "gameId")
	protected LogGameCreated logGameCreated;

	@ManyToOne
	@JoinColumn(name = "userId")
	protected SecurityUser userId;

	@Column(name = "answerTime")
	protected int answerTime;

	@Column(name = "answerdata")
	protected String answerData;

	@Column(name = "created_dt")
	protected Date createdDt;

	public LogStepPlay(String id) {
		this.id = id;
	}

	public LogStepPlay(String id, LogGameCreated logGameCreated,
			SecurityUser userId, int answerTime, String answerData,
			Date createdDt) {
		super();
		this.id = id;
		this.logGameCreated = logGameCreated;
		this.userId = userId;
		this.answerTime = answerTime;
		this.answerData = answerData;
		this.createdDt = createdDt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LogGameCreated getGameCreated() {
		return logGameCreated;
	}

	public void setGameCreated(LogGameCreated gameId) {
		this.logGameCreated = gameId;
	}

	public SecurityUser getUserId() {
		return userId;
	}

	public void setUserId(SecurityUser userId) {
		this.userId = userId;
	}

	public int getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(int answerTime) {
		this.answerTime = answerTime;
	}

	public String getAnswerdata() {
		return answerData;
	}

	public void setAnswerdata(String answerData) {
		this.answerData = answerData;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	@Override
	public String toString() {
		return "LogStepPlay [id=" + id + ", logGameCreated=" + logGameCreated
				+ ", userId=" + userId + ", answerTime=" + answerTime
				+ ", answerData=" + answerData + ", createdDt=" + createdDt
				+ "]";
	}

}
