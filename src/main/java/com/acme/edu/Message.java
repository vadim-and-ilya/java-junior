package com.acme.edu;

public class Message {

    private final String    CHAR = "char: ",
                            PRIMITIVE = "primitive: ",
                            STRING = "string: ",
                            REFERENCE = "reference: ";

    private boolean first = true;
    private Buffer buffer = new Buffer();

    private void printPrefix(String prefix) {
        if (first) {
            Printer.prln(prefix);
            first = false;
        }
    }

    // INT
    Message(int message) {
        printPrefix(PRIMITIVE);
        buffer.save(message);
    }

    // BYTE
    Message(byte message) {
        printPrefix(PRIMITIVE);
        buffer.save(message);
    }

    // CHAR
    Message(char message) {
        printPrefix(CHAR);
        buffer.save(message);
    }

    // STRING
    Message(String message) {
        printPrefix(STRING);
        buffer.save(message);
    }

    // BOOLEAN
    Message(boolean message) {
        printPrefix(PRIMITIVE);
        buffer.save(message);
    }

    // OBJECT
    Message(Object message) {
        printPrefix(REFERENCE);
        buffer.save(message);
    }

}
