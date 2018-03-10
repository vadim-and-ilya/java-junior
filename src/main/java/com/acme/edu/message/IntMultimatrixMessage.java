package com.acme.edu.message;

public class IntMultimatrixMessage implements Message {

    public IntMultimatrixMessage(int[][][][] message) {
        ArrayHandle arrayHandle = new ArrayHandle();
        arrayHandle.roundFour(message);
    }

}
