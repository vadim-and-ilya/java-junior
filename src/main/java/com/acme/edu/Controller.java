package com.acme.edu;

public class Controller {

    public static void newMessage(Object message) {

        String currentType = message.getClass().getSimpleName();

        if (currentType.equals(Buffer.previousType)) {
            if (message.equals(Buffer.getLastLine())) {
                Buffer.count++;
            }
        } else {
            Buffer.previousType = currentType;
            Buffer.count = 1;
        }

    }

}
