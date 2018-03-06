package com.acme.edu.message;

public class ArrayHandle implements Message {

    void roundOne(int[] message) {
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
    void roundTwo(int[][] message) {
        buffer.save("{");
        for (int i = 0; i < message.length; i++) {
            roundOne(message[i]);
        }
        buffer.save("}");
    }

    void roundThree(int[][][] message) {
        buffer.save("{");
        for (int i = 0; i < message.length; i++) {
            roundTwo(message[i]);
        }
        buffer.save("}");
    }

    void roundFour(int[][][][] message) {
        buffer.save("{");
        for (int i = 0; i < message.length ; i++) {
            roundThree(message[i]);
        }
        buffer.save("}");
    }

}
