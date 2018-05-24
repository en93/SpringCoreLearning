package JavaConfig.babington.ian.spring;

public class myPodcast implements AudioMediaFile{
	
	String presenter = "Steve Red";
	String title = "RadioRock";
	String creator = "BNYC Studios"; 

	@Override
	public String getInfo() {
		return "Playing " + title + " by " + creator + "." + "\nHosted by " + presenter + ".";
	}

	@Override
	public String play() {		
		return "Playing " + title + "...";
	}
}
