package JavaConfig.babington.ian.spring;

public abstract class AudioMediaFile {
	String title;
	String creator;
	
	public AudioMediaFile(String title, String creator) {
		this.title = title;
		this.creator = creator;
	}

	public String getInfo() {
		return "Playing " + title + " by " + creator + ".";
	}	
}
