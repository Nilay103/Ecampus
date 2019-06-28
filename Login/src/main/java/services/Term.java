package services;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import java.util.*;
@Entity
public class Term {
	private String termId ;
	private String acadYear;
	private String type;
	@OneToMany
	private List<Offer> offer = new ArrayList<>();
	@OneToMany
	private List<StudentGradeDetails> studGradeDetail = new ArrayList<>();
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getAcadYear() {
		return acadYear;
	}
	public void setAcadYear(String acadYear) {
		this.acadYear = acadYear;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
