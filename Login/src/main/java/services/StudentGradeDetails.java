package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class StudentGradeDetails {
	private String studentId;
	private String termId;
	private String CPI;
	private String SPI;
	@ManyToOne
	private Term term;
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
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
