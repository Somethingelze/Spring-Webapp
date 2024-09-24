package org.com.some;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;


    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }

    public String play() {
        return classicalMusic.getSong();

    }
}