package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class IntMatrixMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatIntMatrix(this);
    }

    public IntMatrixMessage(int[][] message) {
        ArrayHandle arrayHandle = new ArrayHandle();
        arrayHandle.roundTwo(message);
    }

}
