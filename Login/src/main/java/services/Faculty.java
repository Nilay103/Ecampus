package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;

import java.util.*;
@Entity
public class Faculty {
	private String facultyId;
	private String firstName;
	private String lastName;
	private String contact;
	private String emailId;
	
	@ManyToMany
	private List<Offer> offer = new ArrayList<Offer>();
	
	
	
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
}
