package com.acme.edu.message;

public class VarargMessage implements Message {

    public VarargMessage(int param, int[] message) {
        for (int current: message) {
            param += current;
        }
        buffer.save(param);
    }

}
