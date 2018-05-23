package JavaConfig.babington.ian.spring;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import config.myPlayer;

public class App 
{
    public static void main( String[] args ){
    	
    	//Loads beans from application context and shows they work
        MediaPlayer mp;
        List<String> stuff;
        try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(myPlayer.class)){
        	mp = ctx.getBean(MediaPlayer.class);
        	stuff = (List<String>) ctx.getBean("advertisers");
        }              
        mp.playMediaInfo();
        mp.playMedia();
        
        System.out.println("List of size: " + stuff.size());
    }
}
