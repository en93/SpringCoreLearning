package JavaConfig.babington.ian.spring;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.beans.factory.annotation.Qualifier;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=myPlayer.class)
public class MediaPlayerTest{
	
	final String newLine = System.lineSeparator();
	
	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();
	
	@Autowired
	private myPlayer player;
	
	@Autowired
	@Qualifier("advert")
	private List<String> advertisers;
	
	@Test
	public void advertisersNotNull() {
		assertNotNull(advertisers);		
	}
	
	@Test
	public void awesomePlayerNotNull() {
		assertNotNull(player);
	}
	
	@Test
	public void playMediaTest() {
		systemOutRule.clearLog();
		player.playMedia();
		assertEquals("Playing RadioRock..." + newLine, systemOutRule.getLog());
	}
	
	@Test
	public void advertisersRightLength() {
		assertEquals(advertisers.size(), 4);
	}
	
	@Test
	public void advertisersRightValues() {
		assertEquals(advertisers.get(0), "Add-1");
		assertEquals(advertisers.get(1), "Add-2");
		assertEquals(advertisers.get(2), "Add-3");
		assertEquals(advertisers.get(3), "42");
	}
	
}