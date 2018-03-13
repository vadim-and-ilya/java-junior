package com.acme.edu.message;

public class CheckString {

    public static void check() {
        if (Message.controller.getTemporary() != null) {
            if (Message.controller.getCounter() > 1) {
                Message.buffer.save(Message.controller.getTemporary() + " (x" + Message.controller.getCounter() + ")");
            } else {
                Message.buffer.save(Message.controller.getTemporary());
            }
            Message.controller.setTemporary(null);
        }
    }

}