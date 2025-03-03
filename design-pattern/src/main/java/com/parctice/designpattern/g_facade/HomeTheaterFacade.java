package com.parctice.designpattern.g_facade;

public class HomeTheaterFacade {
    final Amplifier amplifier;
    final Tuner tuner;
    final StreamingPlayer streamingPlayer;


    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, StreamingPlayer streamingPlayer) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.streamingPlayer = streamingPlayer;
    }

    public void watchMovie(String movie) {
        System.out.println("영화 볼 준비중");
        amplifier.on();
        amplifier.setStreamingPlayer(streamingPlayer);
        streamingPlayer.on();
        streamingPlayer.play(movie);
    }
}
