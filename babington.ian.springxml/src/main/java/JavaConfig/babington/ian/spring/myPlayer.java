package JavaConfig.babington.ian.spring;

public class myPlayer implements MediaPlayer {
	
	AudioMediaFile file;
	
	public void setFile(AudioMediaFile file) {
		this.file = file;
	}
	
	public void playMediaInfo() {
		System.out.println(file.getInfo());
	}
	
	public void playMedia() {
		System.out.println(file.play());
	}
	
}
