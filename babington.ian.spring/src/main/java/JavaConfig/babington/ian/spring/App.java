package JavaConfig.babington.ian.spring;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.myPlayer;
//import config.AwesomePlayerWithTrack;

public class App 
{
    public static void main( String[] args ){
    	
    	//Loads beans from application context and shows they work
        MediaPlayer mp;
//        AwesomePlayerWithTrack ap;
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(myPlayer.class)){
        	mp = ctx.getBean(MediaPlayer.class);
//        	ap = ctx.getBean(AwesomePlayerWithTrack.class);
        }        
        
        mp.playMediaInfo();
        mp.playMedia();
//
//        ap.playMediaInfo();
//        ap.playMedia();        
    }
}
