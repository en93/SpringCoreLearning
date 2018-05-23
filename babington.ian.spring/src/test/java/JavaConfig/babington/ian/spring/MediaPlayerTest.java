package JavaConfig.babington.ian.spring;

import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.myPlayer;

import org.springframework.test.context.ContextConfiguration;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=myPlayer.class)
public class MediaPlayerTest{
	
	@Autowired
	private myPlayer player;
	
	@Test
	public void AwesomePlayerNotNull() {
		assertNotNull(player);
	}

}
