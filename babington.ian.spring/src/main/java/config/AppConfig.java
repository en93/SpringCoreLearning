package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import JavaConfig.babington.ian.spring.MediaPlayer;
import JavaConfig.babington.ian.spring.AudioMediaFile;
import JavaConfig.babington.ian.spring.Podcast;
import JavaConfig.babington.ian.spring.Ebook;

@Configuration
public class AppConfig {
	
	@Bean
	public MediaPlayer myPlayer() {
		MediaPlayer mp = new MediaPlayer();
		mp.setFile(myPodcast());
		return mp;
	}
	
	@Bean 
	public AudioMediaFile myPodcast() {
		Podcast myPodcast = new Podcast("RadioRock", "BNYC Studios", "Steve Red");
		return myPodcast;
	}
	
	@Bean 
	public AudioMediaFile myEbook() {
		Ebook myEbook = new Ebook("Doors of Ghosts", "Mark Stone", "John Sand");
		return myEbook ;
	} 

}
