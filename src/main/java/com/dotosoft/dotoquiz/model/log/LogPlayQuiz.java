package com.dotosoft.dotoquiz.model.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.data.DataTopics;
import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name="log_playQuiz", catalog="dotoquiz")
public class LogPlayQuiz implements java.io.Serializable {

	@Id
	protected int id;
	
	@ManyToOne(targetEntity=SecurityUser.class, fetch=FetchType.EAGER)
	protected SecurityUser secUser;
	
	@ManyToOne(targetEntity=DataTopics.class, fetch=FetchType.EAGER)
	protected DataTopics datTopics;
	
	@Column(name="playDate", length=19)
	protected Date playDate;
	
	@Column(name="status", length=100)
	protected String status;
	
	@Column(name="reason")
	protected String reason;
	
	@Column(name="points")
	protected Integer points;

	public LogPlayQuiz() {
	}

	public LogPlayQuiz(int id) {
		this.id = id;
	}

	public LogPlayQuiz(int id, SecurityUser secUser, DataTopics datTopics,
			Date playDate, String status, String reason, Integer points) {
		this.id = id;
		this.secUser = secUser;
		this.datTopics = datTopics;
		this.playDate = playDate;
		this.status = status;
		this.reason = reason;
		this.points = points;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SecurityUser getSecUser() {
		return this.secUser;
	}

	public void setSecUser(SecurityUser secUser) {
		this.secUser = secUser;
	}

	public DataTopics getDatTopics() {
		return this.datTopics;
	}

	public void setDatTopics(DataTopics sosTopics) {
		this.datTopics = datTopics;
	}

	public Date getPlayDate() {
		return this.playDate;
	}

	public void setPlayDate(Date playDate) {
		this.playDate = playDate;
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

}
