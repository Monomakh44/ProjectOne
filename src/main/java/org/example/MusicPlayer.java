package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class MusicPlayer {
    private Music music1;
    private Music music2;
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public MusicPlayer() {
    }

    public void setMusic(Music music) {
        this.music1 = music;
    }

    public String playerMusic() {
        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }
}
