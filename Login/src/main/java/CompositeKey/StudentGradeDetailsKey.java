package CompositeKey;

import javax.persistence.Embeddable;

@Embeddable
public class StudentGradeDetailsKey {
	private String StudentId;
	private String Term;
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getTerm() {
		return Term;
	}
	public void setTerm(String term) {
		Term = term;
	}
	
}
