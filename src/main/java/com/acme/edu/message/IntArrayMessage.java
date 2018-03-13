package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class IntArrayMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatIntArray(this);
    }

    public IntArrayMessage(int[] message) {
        ArrayHandle arrayHandle = new ArrayHandle();
        arrayHandle.roundOne(message);
    }

}
