package services;

import javax.persistence.Entity;
import javax.persistence.Id;

import CompositeKey.*;
import javax.persistence.ManyToMany;
import java.util.*;
@Entity
public class Registration {
	Registration registration;
	private String auditable;
	private String grade;
	private String dateOfReg;
	private String remark;
	private String dropped;
	@ManyToMany
	private List<Student> student = new ArrayList<>();
	@ManyToMany
	private List<Offer> offer = new ArrayList<>();
	@Id
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
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
