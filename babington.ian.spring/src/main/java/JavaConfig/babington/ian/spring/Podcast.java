package JavaConfig.babington.ian.spring;


public class Podcast extends AudioMediaFile{	
	String presenter;
	
	public Podcast(String title, String creator, String presenter) {
		super(title, creator);
		this.presenter = presenter;
	}
	
	@Override
	public String getInfo() {
		return super.getInfo() + " Hosted by " + presenter + ".";
	}
}
