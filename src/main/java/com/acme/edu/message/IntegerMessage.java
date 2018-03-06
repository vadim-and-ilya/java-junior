package com.acme.edu.message;

import com.acme.edu.Controller;

public class IntegerMessage implements Message {

    public IntegerMessage(int message) {
        CheckString.check();

        if (controller.getSumInt() == 0 & !Controller.getCalc()) {
            buffer.save(message);
        }
        if (Controller.getCalc()) {
            if ((controller.getSumInt() + message) > 0 & (controller.getSumInt() + message) >= message) {
                controller.enlargeSumInt(message);
            } else if (controller.getSumInt() + message == 0) {
                buffer.save(message);
            } else if (message == Integer.MAX_VALUE) {
                buffer.save(controller.getSumInt());
                buffer.save(Integer.MAX_VALUE);
                controller.setSumInt(0);
            }
        }
        controller.setSumByte((byte) 0);
        controller.setCounter(1);
    }

}
