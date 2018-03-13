package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class VarargMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatVararg(this);
    }

    public VarargMessage(int param, int[] message) {
        for (int current: message) {
            param += current;
        }
        buffer.save(param);
    }

}
