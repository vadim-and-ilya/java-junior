package com.acme.edu.message;

public class CharMessage implements Message {

    public CharMessage(char message) {
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
        buffer.save(message);
    }

}
