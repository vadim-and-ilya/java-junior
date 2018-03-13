package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class BooleanMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatBoolean(this);
    }

    public BooleanMessage(boolean message) {
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
        buffer.save(message);
    }

}
