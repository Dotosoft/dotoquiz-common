package com.dotosoft.dotoquiz.model.representations;

import com.dotosoft.dotoquiz.model.data.DataQuestions;

public class AnswerData {
	public AnswerData(String questionAnswer, DataQuestions dataQuestion) {
		this.questionAnswer = questionAnswer;
		this.dataQuestion = dataQuestion;
	}

	protected String questionAnswer;
	protected DataQuestions dataQuestion;

	public String getQuestionAnswer() {
		return questionAnswer;
	}

	public void setQuestionAnswer(String questionAnswer) {
		this.questionAnswer = questionAnswer;
	}

	public DataQuestions getDataQuestion() {
		return dataQuestion;
	}

	public void setDataQuestion(DataQuestions dataQuestion) {
		this.dataQuestion = dataQuestion;
	}

	@Override
	public String toString() {
		return "AnswerData [questionAnswer=" + questionAnswer
				+ ", dataQuestion=" + dataQuestion + "]";
	}

}
