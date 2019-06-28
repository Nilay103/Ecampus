package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import java.util.*;

@Entity
public class Requirement {
	private String schemeId;
	private String categoryId;
	private String minCredit;
	private String numOfCourse;
	@ManyToOne
	private Scheme scheme;
	@ManyToOne
	private CourseCategory courseCategory;
	public String getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getMinCredit() {
		return minCredit;
	}
	public void setMinCredit(String minCredit) {
		this.minCredit = minCredit;
	}
	public String getNumOfCourse() {
		return numOfCourse;
	}
	public void setNumOfCourse(String numOfCourse) {
		this.numOfCourse = numOfCourse;
	}
	
}
