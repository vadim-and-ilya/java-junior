package com.acme.edu;

public class Logger {

    // char
    public static void log(char message) {
        System.out.println("char: " + message);
    }

    // int
    public static void log(int message) {
        System.out.println("primitive: " + message);
    }

    // byte
    public static void log(byte message) {
        System.out.println("primitive: " + message);
    }

    // String
    public static void log(String message) {
        System.out.println("string: " + message);
    }

    // boolean
    public static void log(boolean message) {
        System.out.println("primitive: " + message);
    }

    // Object
    public static void log(Object message) {
        System.out.println("reference: " + message);
    }

}
