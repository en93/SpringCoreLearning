//package config;
//
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//import JavaConfig.babington.ian.spring.MediaPlayer;
//import JavaConfig.babington.ian.spring.AudioMediaFile;
//import JavaConfig.babington.ian.spring.Podcast;
//import JavaConfig.babington.ian.spring.Ebook;
//
//@Configuration
//public class AppConfig {
//	
//	@Bean
//	@Primary
//	public MediaPlayer myPlayer(@Qualifier("best_seller") AudioMediaFile file) {
//		MediaPlayer mp = new MediaPlayer();
//		mp.setFile(file);
//		return mp;
//	}
//	
//	@Bean 
//	@Qualifier("best_seller")
//	public Podcast myPodcast() {
//		Podcast myPodcast = new Podcast("RadioRock", "BNYC Studios", "Steve Red");
//		return myPodcast;
//	}
//	
//	@Bean 
//	public Ebook myEbook() {
//		Ebook myEbook = new Ebook("Doors of Ghosts", "Mark Stone", "John Sand");
//		return myEbook ;		
//	} 
//}
