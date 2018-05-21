package JavaConfig.babington.ian.spring;

public class MediaPlayer {
	AudioMediaFile file;
	

	
	public AudioMediaFile getFile() {
		return file;
	}

	public void setFile(AudioMediaFile file) {
		this.file = file;
	}

	public void playMediaInfo() {
		System.out.println(file.getInfo());
	}
	
	public void playMedia() {
		System.out.println("Playing " + file.title + "...");
	}
	
}
