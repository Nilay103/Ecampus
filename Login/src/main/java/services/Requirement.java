package services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import CompositeKey.RequirementKey;

import java.util.*;

@Entity
public class Requirement {
	RequirementKey requirementKey;
	
	private String minCredit;
	private String numOfCourse;
	@ManyToOne
	private Scheme scheme;
	@ManyToOne
	private CourseCategory courseCategory;
	@Id
	public RequirementKey getRequirementKey() {
		return requirementKey;
	}
	public void setRequirementKey(RequirementKey requirementKey) {
		this.requirementKey = requirementKey;
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
