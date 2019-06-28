package services;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.*;
@Entity
public class Offer {
	private String offerId;
	private String courseId;
	private String progId;
	private String termId;
	private String batch;
	private String facultyId;
	private String slotNo;
	private String auditable;
	@ManyToMany
	private List<Registration> registration = new ArrayList<>();
	@OneToMany
	private List<GradeModification> gradeModification = new ArrayList<>();
	@ManyToOne
	private Course course;
	@ManyToMany
	private List<Program>program = new ArrayList<>();
	@ManyToOne
	private Term term;
	@ManyToMany
	private List<Faculty> faculty = new ArrayList<Faculty>();
	
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getProgId() {
		return progId;
	}
	public void setProgId(String progId) {
		this.progId = progId;
	}
	public String getTermId() {
		return termId;
	}
	public void setTermId(String termId) {
		this.termId = termId;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(String facultyId) {
		this.facultyId = facultyId;
	}
	public String getSlotNo() {
		return slotNo;
	}
	public void setSlotNo(String slotNo) {
		this.slotNo = slotNo;
	}
	public String getAuditable() {
		return auditable;
	}
	public void setAuditable(String auditable) {
		this.auditable = auditable;
	}
	
}
