package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class CharMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatChar(this);
    }

    public CharMessage(char message) {
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
        buffer.save(message);
    }

}
