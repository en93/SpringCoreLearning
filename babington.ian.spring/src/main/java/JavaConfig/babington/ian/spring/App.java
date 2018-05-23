package JavaConfig.babington.ian.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MediaPlayer mp;
        AwesomePlayerWithTrack ap;
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class, AwesomePlayerWithTrack.class)){
        	mp = ctx.getBean(MediaPlayer.class);
        	ap = ctx.getBean(AwesomePlayerWithTrack.class);
        }        
        
        mp.playMediaInfo();
        mp.playMedia();

        ap.playMediaInfo();
        ap.playMedia();        
    }
}
