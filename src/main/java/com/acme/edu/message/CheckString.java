package com.acme.edu.message;

public class CheckString implements Message {

    public static void check() {
        if (controller.getTemporary() != null) {
            if (controller.getCounter() > 1) {
                buffer.save(controller.getTemporary() + " (x" + controller.getCounter() + ")");
            } else {
                buffer.save(controller.getTemporary());
            }
            controller.setTemporary(null);
        }
    }

}