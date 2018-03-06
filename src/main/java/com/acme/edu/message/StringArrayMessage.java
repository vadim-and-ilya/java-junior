package com.acme.edu.message;

public class StringArrayMessage implements Message {

    public StringArrayMessage(String[] message) {
        for (String current: message) {
            buffer.save(current);
        }
    }

}
