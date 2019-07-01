package services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import CompositeKey.CourseStructureKey;

import java.util.*;
@Entity
public class CourseStructure {
	
	CourseStructureKey coureseStructureKey;
	private String termId;
	@ManyToMany 
	private List<Scheme> scheme = new ArrayList<Scheme>();
	@OneToMany
	private List<Course> course = new ArrayList<>();
	@Id
	public CourseStructureKey getCoureseStructureKey() {
		return coureseStructureKey;
	}
	public void setCoureseStructureKey(CourseStructureKey coureseStructureKey) {
		this.coureseStructureKey = coureseStructureKey;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	
}
