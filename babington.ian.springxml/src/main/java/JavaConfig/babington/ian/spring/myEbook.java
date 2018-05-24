package JavaConfig.babington.ian.spring;

public class myEbook implements AudioMediaFile {
	
	String narrator = "Mark Stone"; 
	String title = "Doors of Ghosts";
	String creator = "John Sand";

	@Override
	public String getInfo() {
		return "Playing " + title + " by " + creator + "." + "\nNarrated by " + narrator + ".";
	}

	@Override
	public String play() {
		return "Playing " + title + "...";
	}
	
}
