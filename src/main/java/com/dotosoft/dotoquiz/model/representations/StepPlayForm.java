package com.dotosoft.dotoquiz.model.representations;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

public class StepPlayForm {
	public StepPlayForm(String gameId, String questionId,
			String questionAnswer, int answerTime) {
		this.gameId = gameId;
		this.questionId = questionId;
		this.questionAnswer = questionAnswer;
		this.answerTime = answerTime;
	}

	@NotEmpty // ensure that name isn't null or blank
	protected String gameId;
	
	@NotEmpty // ensure that name isn't null or blank
	protected String questionId;
	
	@NotEmpty // ensure that name isn't null or blank
	protected String questionAnswer;
	
	@NotEmpty // ensure that name isn't null or blank
	@Max(20)
    @Min(0)
	protected int answerTime;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public int getAnswerTime() {
		return answerTime;
	}

	public void setAnswerTime(int answerTime) {
		this.answerTime = answerTime;
	}

	@Override
	public String toString() {
		return "StepPlayForm [gameId=" + gameId + ", questionId=" + questionId
				+ ", questionAnswer=" + questionAnswer + ", answerTime="
				+ answerTime + "]";
	}

}
