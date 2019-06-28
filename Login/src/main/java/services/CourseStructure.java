package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import java.util.*;
@Entity
public class CourseStructure {
	private String schemeId;
	private String courseCode;
	private String termId;
	@ManyToMany 
	private List<Scheme> scheme = new ArrayList<Scheme>();
	@OneToMany
	private List<Course> course = new ArrayList<>();
	public String getSchemeId() {
		return schemeId;
	}
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
}
