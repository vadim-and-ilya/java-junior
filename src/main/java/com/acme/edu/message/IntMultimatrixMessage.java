package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class IntMultimatrixMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatIntMultiMatrix(this);
    }

    public IntMultimatrixMessage(int[][][][] message) {
        ArrayHandle arrayHandle = new ArrayHandle();
        arrayHandle.roundFour(message);
    }

}
