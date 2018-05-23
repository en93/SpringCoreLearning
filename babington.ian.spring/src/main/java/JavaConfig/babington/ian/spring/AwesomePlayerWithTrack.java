package JavaConfig.babington.ian.spring;

import org.springframework.context.annotation.Configuration;

@Configuration
public class AwesomePlayerWithTrack extends MediaPlayer {
	public AwesomePlayerWithTrack() {
		Ebook myEbook = new Ebook("Path of mud", "Steve Smith", "Dave Daniels");
		setFile(myEbook);		
	}
}
