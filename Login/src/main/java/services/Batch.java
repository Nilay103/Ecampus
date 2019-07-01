package services;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import CompositeKey.BatchKey;

import java.util.*;
@Entity
public class Batch {
	//private String batch;
	//private String progId;
	BatchKey batchKey;
	private String schemeId;
	@ManyToOne
	private Scheme scheme;
	@OneToMany
	private List<Program> program = new ArrayList<>();
	/*public String getBatch() {
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
	}*/
	
	public String getSchemeId() {
		return schemeId;
	}
	@Id
	public BatchKey getBatchKey() {
		return batchKey;
	}
	public void setBatchKey(BatchKey batchKey) {
		this.batchKey = batchKey;
	}
	public void setSchemeId(String schemeId) {
		this.schemeId = schemeId;
	}
	
}
