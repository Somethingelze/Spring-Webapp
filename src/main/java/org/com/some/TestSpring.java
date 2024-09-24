package org.com.some;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.play(MusicGenre.CLASSICAL);
        musicPlayer.play(MusicGenre.ROCK);

        context.close();
    }
}