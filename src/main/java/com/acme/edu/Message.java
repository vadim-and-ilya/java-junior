package com.acme.edu;

public class Message {

    private final String    CHAR = "char: ",
                            PRIMITIVE = "primitive: ",
                            STRING = "string: ",
                            REFERENCE = "reference: ",
                            ARRAY = "primitives array: ",
                            MATRIX = "primitives matrix: ",
                            MULTI_MATRIX = "primitives multimatrix: ";

    private boolean first = true;
    private Buffer buffer = new Buffer();

    private void printPrefix(String prefix) {
        if (first) {
            Printer.prn(prefix);
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

    // ARRAY
    Message(int[] message) {
        printPrefix(ARRAY);
        roundOne(message);
    }

    // MATRIX
    Message(int[][] message) {
        printPrefix(MATRIX);
        roundTwo(message);
    }

    // MULTI_MATRIX
    Message(int[][][][] message) {
        printPrefix(MULTI_MATRIX);
        roundFour(message);
    }

    // STRINGS ARRAY
    Message(String[] message) {
        for (String current: message) {
            buffer.save(current);
        }
    }


    //region Циклы
    private void roundOne(int[] message) {
        String line = "{";
        for (int i = 0; i < message.length; i++) {
            line += message[i];
            if (i < message.length - 1) {
                line += ", ";
            }
        }
        line += "}";
        buffer.save(line);
    }

    private void roundTwo(int[][] message) {
        buffer.save("{");
        for (int i = 0; i < message.length; i++) {
            roundOne(message[i]);
        }
        buffer.save("}");
    }

    private void roundThree(int[][][] message) {
        buffer.save("{");
        for (int i = 0; i < message.length; i++) {
            roundTwo(message[i]);
        }
        buffer.save("}");
    }

    private void roundFour(int[][][][] message) {
        buffer.save("{");
        for (int i = 0; i < message.length ; i++) {
            roundThree(message[i]);
        }
        buffer.save("}");
    }
    //endregion+




}
