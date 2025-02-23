package com.parctice.designpattern.f_command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlTest {

    @Test
    void 리모컨_테스트() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        LightOnCommand lightOnCommand = new LightOnCommand(new Light());

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
    }
}