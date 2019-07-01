package services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import CompositeKey.*;
@Entity
public class StudentGradeDetails {
	StudentGradeDetailsKey studentGradeDetailsKey;
	private String CPI;
	private String SPI;
	@ManyToOne
	private Term term;
	@Id
	public StudentGradeDetailsKey getStudentGradeDetailsKey() {
		return studentGradeDetailsKey;
	}
	public void setStudentGradeDetailsKey(StudentGradeDetailsKey studentGradeDetailsKey) {
		this.studentGradeDetailsKey = studentGradeDetailsKey;
	}
	public String getCPI() {
		return CPI;
	}
	public void setCPI(String cPI) {
		CPI = cPI;
	}
	public String getSPI() {
		return SPI;
	}
	public void setSPI(String sPI) {
		SPI = sPI;
	}
	
}
