package CompositeKey;

import javax.persistence.Embeddable;

@Embeddable
public class CourseStructureKey {
	private String schemeId;
	private String courseCode;
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
	
}
