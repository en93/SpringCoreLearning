package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import JavaConfig.babington.ian.spring.AudioMediaFile;
import JavaConfig.babington.ian.spring.MediaPlayer;

@Configuration
@ComponentScan
public class myPlayer implements MediaPlayer {
	
	@Qualifier("best_seller")
	@Autowired
	AudioMediaFile file;
	
	public void playMediaInfo() {
		System.out.println(file.getInfo());
	}
	
	public void playMedia() {
		System.out.println(file.play());
	}
	
}
