package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class StringArrayMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatStringArray(this);
    }

    public StringArrayMessage(String[] message) {
        for (String current: message) {
            buffer.save(current);
        }
    }

}
