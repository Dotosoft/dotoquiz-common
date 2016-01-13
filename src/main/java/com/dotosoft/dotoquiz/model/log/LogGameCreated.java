package com.dotosoft.dotoquiz.model.log;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dotosoft.dotoquiz.model.data.DataTopics;
import com.dotosoft.dotoquiz.model.security.SecurityUser;

@Entity
@Table(name = "log_gameCreated", catalog = "dotoquiz")
public class LogGameCreated {
	public LogGameCreated() {
	}

	@Id
	protected String id;

	@ManyToOne
	@JoinColumn(name = "topicId")
	protected DataTopics topicId;

	@Column(name = "roomId", length = 50)
	protected String roomId;

	@ManyToOne
	@JoinColumn(name = "userA")
	protected SecurityUser userA;

	@ManyToOne
	@JoinColumn(name = "userB")
	protected SecurityUser userB;

	@Column(name = "created_dt", columnDefinition = "DATETIME")
	protected Date createdDt;

	@Column(name = "updated_dt", columnDefinition = "DATETIME")
	protected Date updatedDt;

	@Column(name = "question_data", columnDefinition = "TEXT")
	protected String questionData;

	public LogGameCreated(String id) {
		super();
		this.id = id;
	}

	public LogGameCreated(String id, DataTopics topicId, String roomId,
			SecurityUser userA, SecurityUser userB, String questionData,
			Date createdDt, Date updatedDt) {
		super();
		this.id = id;
		this.topicId = topicId;
		this.roomId = roomId;
		this.userA = userA;
		this.userB = userB;
		this.questionData = questionData;
		this.createdDt = createdDt;
		this.updatedDt = updatedDt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public DataTopics getTopicId() {
		return topicId;
	}

	public void setTopicId(DataTopics topicId) {
		this.topicId = topicId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public SecurityUser getUserA() {
		return userA;
	}

	public void setUserA(SecurityUser userA) {
		this.userA = userA;
	}

	public SecurityUser getUserB() {
		return userB;
	}

	public void setUserB(SecurityUser userB) {
		this.userB = userB;
	}

	public Date getCreatedDt() {
		return createdDt;
	}

	public void setCreatedDt(Date createdDt) {
		this.createdDt = createdDt;
	}

	public Date getUpdatedDt() {
		return updatedDt;
	}

	public void setUpdatedDt(Date updatedDt) {
		this.updatedDt = updatedDt;
	}

	public String getQuestionData() {
		return questionData;
	}

	public void setQuestionData(String questionData) {
		this.questionData = questionData;
	}

	@Override
	public String toString() {
		return "LogGameCreated [id=" + id + ", topicId=" + topicId
				+ ", roomId=" + roomId + ", userA=" + userA + ", userB="
				+ userB + ", createdDt=" + createdDt + ", updatedDt="
				+ updatedDt + ", questionData=" + questionData + "]";
	}

}
