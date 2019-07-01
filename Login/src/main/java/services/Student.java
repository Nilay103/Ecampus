package services;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
	public class Student {
		@Id
		private int sId;
		private String progId;
		private String batch;
		private String first_Name;
		private String last_Name;
		private String contactNum;
		private String emailId;
		
		@ManyToMany
		private List<Registration> registrations = new ArrayList<>();
		@OneToMany
		private List<GradeModification> grademodification = new ArrayList<>();
		@OneToOne
		private Degree degree;
		public int getsId() {
			return sId;
		}
		public void setsId(int sId) {
			this.sId = sId;
		}
		@Override
		public String toString() {
			return "Student [sId=" + sId + ", progId=" + progId + ", batch=" + batch + ", first_Name=" + first_Name
					+ ", last_Name=" + last_Name + ", contactNum=" + contactNum + ", emailId=" + emailId + "]";
		}
		public String getProgId() {
			return progId;
		}
		public void setProgId(String progId) {
			this.progId = progId;
		}
		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		public String getFirst_Name() {
			return first_Name;
		}
		public void setFirst_Name(String first_Name) {
			this.first_Name = first_Name;
		}
		public String getLast_Name() {
			return last_Name;
		}
		public void setLast_Name(String last_Name) {
			this.last_Name = last_Name;
		}
		public String getContactNum() {
			return contactNum;
		}
		public void setContactNum(String contactNum) {
			this.contactNum = contactNum;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		
}
