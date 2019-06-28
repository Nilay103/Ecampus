package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.*;
@Entity
public class Scheme {
	private String schemeID;
	private String minCPI;
	private String minCredits;
	@OneToMany
	private List<Requirement> requirement = new ArrayList<Requirement>();
	@OneToMany
	private List<Scheme> scheme = new ArrayList<>();
	@ManyToMany
	private List<CourseStructure> courseStructure = new ArrayList<>();
	public String getSchemeID() {
		return schemeID;
	}
	public void setSchemeID(String schemeID) {
		this.schemeID = schemeID;
	}
	public String getMinCPI() {
		return minCPI;
	}
	public void setMinCPI(String minCPI) {
		this.minCPI = minCPI;
	}
	public String getMinCredits() {
		return minCredits;
	}
	public void setMinCredits(String minCredits) {
		this.minCredits = minCredits;
	}
	
}
