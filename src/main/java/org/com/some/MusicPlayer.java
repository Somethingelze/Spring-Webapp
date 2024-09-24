package org.com.some;


public class MusicPlayer {
    private Music music;


    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void play() {
        System.out.println("Now playing " + music.getSong());
    }
}