package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.*;
@Entity
public class Registration {
	private String studentId;
	private String offerId;
	private String auditable;
	private String grade;
	private String dateOfReg;
	private String remark;
	private String dropped;
	@ManyToMany
	private List<Student> student = new ArrayList<>();
	@ManyToMany
	private List<Offer> offer = new ArrayList<>();
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getAuditable() {
		return auditable;
	}
	public void setAuditable(String auditable) {
		this.auditable = auditable;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDateOfReg() {
		return dateOfReg;
	}
	public void setDateOfReg(String dateOfReg) {
		this.dateOfReg = dateOfReg;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getDropped() {
		return dropped;
	}
	public void setDropped(String dropped) {
		this.dropped = dropped;
	}
	
}
