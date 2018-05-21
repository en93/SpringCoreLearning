package JavaConfig.babington.ian.spring;

import org.springframework.context.ApplicationContext;
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
        System.out.println( "Hello World!" );
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MediaPlayer mp = ctx.getBean(MediaPlayer.class);
        mp.playMediaInfo();
        mp.playMedia();
    }
}
