package CompositeKey;

import javax.persistence.Embeddable;

@Embeddable
public class BatchKey {
	
	private String batch;
	private String progId;
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getProgId() {
		return progId;
	}
	public void setProgId(String progId) {
		this.progId = progId;
	}
	
}
