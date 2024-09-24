package org.com.some;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        context.start();

//        Music music = context.getBean("rockMusic", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        musicPlayer.play();
//
//        Music music1 = context.getBean("classicalMusic", Music.class);
//        MusicPlayer musicPlayer1 = new MusicPlayer(music1);
//        musicPlayer1.play();
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.play();

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

        context.close();
    }
}