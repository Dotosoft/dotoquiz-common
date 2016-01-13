package com.dotosoft.dotoquiz.model.representations;

import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

import com.dotosoft.dotoquiz.model.data.DataQuestions;

public class CreateGame {
	public CreateGame(String sessionId, List<DataQuestions> questionCollections) {
		this.sessionId = sessionId;
		this.questionCollections = questionCollections;
	}

	@NotEmpty // ensure that name isn't null or blank
	protected String sessionId;
	
	protected List<DataQuestions> questionCollections;

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public List<DataQuestions> getQuestionCollections() {
		return questionCollections;
	}

	public void setQuestionCollections(List<DataQuestions> questionCollections) {
		this.questionCollections = questionCollections;
	}

	@Override
	public String toString() {
		return "CreateGame [sessionId=" + sessionId + ", questionCollections="
				+ questionCollections + "]";
	}

}
