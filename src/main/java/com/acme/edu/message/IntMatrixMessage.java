package com.acme.edu.message;

public class IntMatrixMessage implements Message {

    public IntMatrixMessage(int[][] message) {
        ArrayHandle arrayHandle = new ArrayHandle();
        arrayHandle.roundTwo(message);
    }

}
