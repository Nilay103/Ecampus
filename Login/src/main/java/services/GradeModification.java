package services;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class GradeModification {
	private String workId;
	private String studentId;
	private String offerId;
	private String responderDate;
	private String approvedByDeanAP;
	private String deanRespDate;
	private String approvedByReg;
	private String regRespDate;
	private String modifiedDate;
	private String remark;
	private String oldGrade;
	private String newGrade;
	@ManyToOne
	private Student student;
	@ManyToOne
	private Offer offer;
	
	public String getWorkId() {
		return workId;
	}
	public void setWorkId(String workId) {
		this.workId = workId;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getOfferId() {
		return offerId;
	}
	public void setOfferId(String offerId) {
		this.offerId = offerId;
	}
	public String getResponderDate() {
		return responderDate;
	}
	public void setResponderDate(String responderDate) {
		this.responderDate = responderDate;
	}
	public String getApprovedByDeanAP() {
		return approvedByDeanAP;
	}
	public void setApprovedByDeanAP(String approvedByDeanAP) {
		this.approvedByDeanAP = approvedByDeanAP;
	}
	public String getDeanRespDate() {
		return deanRespDate;
	}
	public void setDeanRespDate(String deanRespDate) {
		this.deanRespDate = deanRespDate;
	}
	public String getApprovedByReg() {
		return approvedByReg;
	}
	public void setApprovedByReg(String approvedByReg) {
		this.approvedByReg = approvedByReg;
	}
	public String getRegRespDate() {
		return regRespDate;
	}
	public void setRegRespDate(String regRespDate) {
		this.regRespDate = regRespDate;
	}
	public String getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getOldGrade() {
		return oldGrade;
	}
	public void setOldGrade(String oldGrade) {
		this.oldGrade = oldGrade;
	}
	public String getNewGrade() {
		return newGrade;
	}
	public void setNewGrade(String newGrade) {
		this.newGrade = newGrade;
	}
	
}
