package com.acme.edu.message;

import com.acme.edu.formatter.FormatVisitor;

public class StringMessage implements Message {

    @Override
    public void accept(FormatVisitor fv) {
        fv.formatString(this);
    }

    public StringMessage(String message) {

        int sumInt = controller.getSumInt();
        byte sumByte = controller.getSumByte();
        String temporary = controller.getTemporary();
        int counter = controller.getCounter();

        if (sumInt != 0) { buffer.save(sumInt); }
        if (sumByte != 0) { buffer.save(sumByte); }

        if (temporary != null) {
            if (message.equals(temporary)) {
                controller.setCounter(counter+1);
            } else {
                if (counter > 1) {
                    buffer.save(temporary + " (x" + counter + ")");
                } else {
                    buffer.save(temporary);
                }
                controller.setCounter(1);
            }
        }
        controller.setTemporary(message);
        controller.setSumInt(0);
        controller.setSumByte((byte) 0);
    }

}
