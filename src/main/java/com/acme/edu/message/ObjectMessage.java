package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class ObjectMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatObject(this);
    }

    public ObjectMessage(Object message) {
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
        buffer.save(message);
    }

}
