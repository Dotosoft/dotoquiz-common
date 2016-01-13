package com.dotosoft.dotoquiz.model.representations;

import org.hibernate.validator.constraints.NotEmpty;

public class ResultPlayForm {
	public ResultPlayForm() {
	}

	public ResultPlayForm(String gameId, String status, String reason,
			int points) {
		this.gameId = gameId;
		this.status = status;
		this.reason = reason;
		this.points = points;
	}

	@NotEmpty // ensure that name isn't null or blank
	protected String gameId;
	
	@NotEmpty // ensure that name isn't null or blank
	protected String status;
	
	protected String reason;
	protected int points;

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	@Override
	public String toString() {
		return "ResultPlayForm [gameId=" + gameId + ", status=" + status
				+ ", reason=" + reason + ", points=" + points + "]";
	}

}
