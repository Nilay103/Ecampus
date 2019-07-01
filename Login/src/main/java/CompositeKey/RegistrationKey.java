package CompositeKey;

import javax.persistence.Embeddable;

@Embeddable
public class RegistrationKey {
	private String studentId;
	private String offerId;
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
	
}
