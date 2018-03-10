package com.acme.edu.message;

import com.acme.edu.Controller;
import com.acme.edu.formatter.FormatVisitor;

public class ByteMessage implements Message {

    @Override
    public String accept(FormatVisitor fv) {
        return null;
    }

    public ByteMessage(Byte message) {

        CheckString.check();

        if (controller.getSumByte() == 0 & !Controller.getCalc()) {
            buffer.save(message);
        }
        if (Controller.getCalc()) {
            if ((int)(controller.getSumByte() + message) < Byte.MAX_VALUE & (controller.getSumByte() + message) >= message) {
                controller.enlargeSumByte(message);
            } else if (controller.getSumByte() + message == 0 ) {
                buffer.save(message);
            } else if (message == Byte.MAX_VALUE) {
                buffer.save(controller.getSumByte());
                buffer.save(Byte.MAX_VALUE);
                controller.setSumByte((byte) 0);
            }
        }
        controller.setSumInt(0);

    }
}
