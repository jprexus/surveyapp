package com.surveyshrike.surveyapp.domain;

public class SurveyBO {

	private Long id;

	private String user;

	private String email;

	private boolean attending;

	private String reason;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public boolean isAttending() {
		return this.attending;
	}

	public void setAttending(boolean attending) {
		this.attending = attending;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
