package config;

import org.springframework.context.annotation.Configuration;
import JavaConfig.babington.ian.spring.AudioMediaFile;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("best_seller")
@Configuration
public class myPodcast implements AudioMediaFile{
	
	String presenter = "Steve Red";
	String title = "RadioRock";
	String creator = "BNYC Studios"; 

	@Override
	public String getInfo() {
		return "Playing " + title + " by " + creator + "." + "\nHosted by " + presenter + ".";
	}

	@Override
	public String play() {		
		return "Playing " + title + "...";
	}
}
