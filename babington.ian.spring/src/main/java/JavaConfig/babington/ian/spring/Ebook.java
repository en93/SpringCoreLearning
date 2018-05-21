package JavaConfig.babington.ian.spring;


public class Ebook extends AudioMediaFile{
	String narrator;

	public Ebook(String title, String creator, String narrator) {
		super(title, creator);
		this.narrator = narrator;
	}	
	
	@Override
	public String getInfo() {
		return super.getInfo() + " Narrated by " + narrator + ".";
	}
	
}
