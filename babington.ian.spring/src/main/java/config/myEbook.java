package config;

import org.springframework.context.annotation.Configuration;
import JavaConfig.babington.ian.spring.AudioMediaFile;

@Configuration
public class myEbook implements AudioMediaFile {
	
	String narrator = "Doors of Ghosts";
	String title = "Mark Stone";
	String creator = "John Sand";

	@Override
	public String getInfo() {
		return "Playing " + title + " by " + creator + "." + "\nNarrated by " + narrator + ".";
	}

	@Override
	public String play() {
		return "Playing " + title + "...";
	}
	
}
