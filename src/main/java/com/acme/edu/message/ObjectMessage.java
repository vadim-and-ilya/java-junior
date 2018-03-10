package com.acme.edu.message;

public class ObjectMessage implements Message {

    public ObjectMessage(Object message) {
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
        buffer.save(message);
    }

}
