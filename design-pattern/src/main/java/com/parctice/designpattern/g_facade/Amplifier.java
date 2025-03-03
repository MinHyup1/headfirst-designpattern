package com.parctice.designpattern.g_facade;

public class Amplifier {
    Tuner tuner;
    StreamingPlayer player;

    public void on() {
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        this.player = streamingPlayer;
    }
}
