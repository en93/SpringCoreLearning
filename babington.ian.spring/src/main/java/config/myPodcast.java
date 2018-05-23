package config;

import org.springframework.context.annotation.Configuration;
import JavaConfig.babington.ian.spring.AudioMediaFile;
import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("best_seller")
@Configuration
public class myPodcast implements AudioMediaFile{
	
	String presenter = "RadioRock";
	String title = "BNYC Studios";
	String creator = "Steve Red";

	@Override
	public String getInfo() {
		return "Playing " + title + " by " + creator + "." + "\nHosted by " + presenter + ".";
	}

	@Override
	public String play() {		
		return "Playing " + title + "...";
	}
}
