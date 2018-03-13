package com.acme.edu.message;

public class ArrayHandle {

    void roundOne(int[] message) {
        String line = "{";
        for (int i = 0; i < message.length; i++) {
            line += message[i];
            if (i < message.length - 1) {
                line += ", ";
            }
        }
        line += "}";
        Message.buffer.save(line);
    }
    void roundTwo(int[][] message) {
        Message.buffer.save("{");
        for (int i = 0; i < message.length; i++) {
            roundOne(message[i]);
        }
        Message.buffer.save("}");
    }

    void roundThree(int[][][] message) {
        Message.buffer.save("{");
        for (int i = 0; i < message.length; i++) {
            roundTwo(message[i]);
        }
        Message.buffer.save("}");
    }

    void roundFour(int[][][][] message) {
        Message.buffer.save("{");
        for (int i = 0; i < message.length ; i++) {
            roundThree(message[i]);
        }
        Message.buffer.save("}");
    }

}
