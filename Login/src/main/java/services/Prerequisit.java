package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.*;
@Entity
public class Prerequisit {
	private String courseCode;
	private String preCourse;
	@ManyToMany
	private List<Course> course = new ArrayList<>();
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPreCourse() {
		return preCourse;
	}
	public void setPreCourse(String preCourse) {
		this.preCourse = preCourse;
	}
	
}
