package com.exam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExamResult {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String UserName;
	private String email;
	private String subject;
	private String MarksGot;
	private String CorrectAnswer;

	public ExamResult(long id, String userName, String email, String subject, String marksGot, String correctAnswer) {
		super();
		this.id = id;
		UserName = userName;
		this.email = email;
		this.subject = subject;
		MarksGot = marksGot;
		CorrectAnswer = correctAnswer;
	}

	public ExamResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMarksGot() {
		return MarksGot;
	}

	public void setMarksGot(String marksGot) {
		MarksGot = marksGot;
	}

	public String getCorrectAnswer() {
		return CorrectAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		CorrectAnswer = correctAnswer;
	}

	@Override
	public String toString() {
		return "ExamResult [id=" + id + ", UserName=" + UserName + ", email=" + email + ", subject=" + subject
				+ ", MarksGot=" + MarksGot + ", CorrectAnswer=" + CorrectAnswer + "]";
	}

}
