//This package will use explicit java wiring

package config;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
public class AppConfig{

	@Bean
	@Qualifier("advert")
	public List<String> advertisers(int number) {
		List<String> list = new ArrayList<String>();
		list.add(add1());
		list.add(add2());
		list.add(add3());
		list.add(String.valueOf(number));
		return list;
	}
	
	@Bean
	public String add1() {
		return("Add-1");		
	}
	
	@Bean
	public String add2() {
		return("Add-2");		
	}
	
	@Bean
	public String add3() {
		return("Add-3");		
	}

	@Bean 
	public int myNumber() {
		return 42;
	}
	
}


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
