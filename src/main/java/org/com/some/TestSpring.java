package org.com.some;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        context.start();
       Music music = context.getBean("musicBean", Music.class);
       MusicPlayer musicPlayer = new MusicPlayer(music);
       musicPlayer.play();
        context.close();
    }
}
