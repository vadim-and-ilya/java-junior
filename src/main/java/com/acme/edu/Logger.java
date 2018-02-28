package com.acme.edu;

public class Logger {

    // char
    public static void log(char message) {
        print("char: " + message);
    }

    // int
    public static void log(int message) {
        print("primitive: " + message);
    }

    // byte
    public static void log(byte message) {
        print("primitive: " + message);
    }

    // String
    public static void log(String message) {
        print("string: " + message);
    }

    // boolean
    public static void log(boolean message) {
        print("primitive: " + message);
    }

    // Object
    public static void log(Object message) {
        print("reference: " + message);
    }

    public static void print(String message) {
        System.out.println(message);
    }
}
