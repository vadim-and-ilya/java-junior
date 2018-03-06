package com.acme.edu.message;

public class IntArrayMessage implements Message {

    public IntArrayMessage(int[] message) {
        ArrayHandle arrayHandle = new ArrayHandle();
        arrayHandle.roundOne(message);
    }

}
