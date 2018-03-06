package com.acme.edu.message;

public class BooleanMessage implements Message {

    public BooleanMessage(boolean message) {
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
        buffer.save(message);
    }

}
