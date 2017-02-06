
public class TitleCaseThread implements Runnable{
	String summary;
	String modifiedSummary="";
	
	public TitleCaseThread(String summary) {
		super();
		this.summary = summary;
	}
	
	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getModifiedSummary() {
		return modifiedSummary.trim();
	}

	public void setModifiedSummary(String modifiedSummary) {
		this.modifiedSummary = modifiedSummary;
	}

	public void run() {
		String a[]=this.summary.split(" ");
		for(int i=0;i<a.length;i++){
			modifiedSummary=modifiedSummary+a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ";
		}
	}
	
}
