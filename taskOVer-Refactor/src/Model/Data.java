package Model;

public class Data {
	private String title;
    private String status;
    private UrgencyLevel urgency;
    private String desc;

    public Data(String title, UrgencyLevel urgency, String desc) {
        this.title = title;
        this.status = "Not Done";
        this.urgency = urgency;
        this.desc = desc;
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public UrgencyLevel getUrgency() {
		return urgency;
	}

	public void setUrgency(UrgencyLevel urgency) {
		this.urgency = urgency;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String formatForDisplay(int index) {
	    return index + ". " + title +
	           " [" + status + "]" +
	           " - Urgency: " + urgency +
	           "\n\tDescription: " + desc;
	}
}