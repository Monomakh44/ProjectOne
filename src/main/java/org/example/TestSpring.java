package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        /*ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        musicPlayer.playerMusic();
        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);
        musicPlayer.playerMusic();
        Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer ClassicalMusicPlayer = new MusicPlayer(music2);
        ClassicalMusicPlayer.playerMusic();
        ClassicalMusic classicalMusic = context.getBean("musicBean",ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());
        MusicPlayer firstMusicPlayer = context.getBean("music-player", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("music-player", MusicPlayer.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;
        System.out.println(comparison);
        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);
        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());
        System.out.println(secondMusicPlayer.getVolume());
        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);*/
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        context.close();
    }
}
