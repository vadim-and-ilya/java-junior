package com.acme.edu;

public class Logger {

    // PRIMITIVE
    public static void log(char message) {
        Controller.newMessage(new Message(message));
    }

    public static void log(int message) {
        Controller.newMessage(new Message(message));
    }

    public static void log(byte message) {
        Controller.newMessage(new Message(message));
    }

    public static void log(boolean message) {
        Controller.newMessage(new Message(message));
    }

    // STRING
    public static void log(String message) {
        Controller.newMessage(new Message(message));
    }

    // REFERENCE
    public static void log(Object message) {
        Controller.newMessage(new Message(message));
    }

    /* ARRAYS */

    // Array
    public static void log(int[] message) {
        Controller.newMessage(new Message(message));
    }

    // Matrix
    public static void log(int[][] message) {
        Controller.newMessage(new Message(message));
    }

    // Multi_Matrix
    public static void log(int[][][][] message) {
        Controller.newMessage(new Message(message));
    }

    // String Array
    public static void log(String[] message) {
        Controller.newMessage(new Message(message));
    }

}
