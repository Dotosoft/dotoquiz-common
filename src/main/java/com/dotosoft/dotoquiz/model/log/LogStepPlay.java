package com.dotosoft.dotoquiz.model.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	protected LogGameCreated gameId;

	@ManyToOne
	protected SecurityUser userId;

	@Column(name = "answerTime")
	protected int answerTime;

	@Column(name = "answer")
	protected int answer;

	@Column(name = "created_dt")
	protected Date createdDt;

	@Column(name = "created_by", length = 50)
	protected String createdBy;

	public LogStepPlay(String id) {
		this.id = id;
	}

	public LogStepPlay(String id, LogGameCreated gameId, SecurityUser userId,
			int answerTime, int answer, Date createdDt, String createdBy) {
		super();
		this.id = id;
		this.gameId = gameId;
		this.userId = userId;
		this.answerTime = answerTime;
		this.answer = answer;
		this.createdDt = createdDt;
		this.createdBy = createdBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LogGameCreated getGameId() {
		return gameId;
	}

	public void setGameId(LogGameCreated gameId) {
		this.gameId = gameId;
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

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
