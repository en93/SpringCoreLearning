package JavaConfig.babington.ian.spring;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ){
    	
    	//Loads beans from application context and shows they work
        MediaPlayer mp;
        List<Integer> stuff;
        try(ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:config/mybeans.xml")){
        	mp = ctx.getBean(MediaPlayer.class);
        	stuff = (List<Integer>) ctx.getBean("advert");
        }              
        mp.playMediaInfo();
        mp.playMedia();
        
        System.out.println("List of size: " + stuff.size());
    }
}
