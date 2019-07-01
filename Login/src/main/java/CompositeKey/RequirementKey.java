package CompositeKey;

import javax.persistence.Embeddable;

@Embeddable
public class RequirementKey {
	private String schemeID;
	private String categoryId;
	public String getSchemeID() {
		return schemeID;
	}
	public void setSchemeID(String schemeID) {
		this.schemeID = schemeID;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	
}
