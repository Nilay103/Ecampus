package services;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Degree {
	private String studentId;
	private String degCardNo;
	private String issueDate;
	private String transcriptionNum;
	@OneToOne
	private Student student;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getDegCardNo() {
		return degCardNo;
	}
	public void setDegCardNo(String degCardNo) {
		this.degCardNo = degCardNo;
	}
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getTranscriptionNum() {
		return transcriptionNum;
	}
	public void setTranscriptionNum(String transcriptionNum) {
		this.transcriptionNum = transcriptionNum;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
