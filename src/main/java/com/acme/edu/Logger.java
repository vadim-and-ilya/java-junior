package com.acme.edu;

public class Logger {

    static String state = "";
    static int sum = 0;
    static int counter = 0;
    static String last = "";

    // char
    public static void log(char message) {
        print("char: " + message);
    }

    // int
    public static void log(int message) {
        last ="drop";
        if (state.equals("SUM")) {
            if (message == Integer.MAX_VALUE) {
                print(String.valueOf(sum));
                print(String.valueOf(message));
                flush();
            }
            else
            sum += message;
        }
        else
            print("primitive: " + message);
    }

    // byte
    public static void log(byte message) {
        if (state.equals("SUM")) {
            if (message == Byte.MAX_VALUE) {
                print(String.valueOf(sum));
                print(String.valueOf(message));
                flush();
            }
            else
                sum += message;
        }
        else
        print("primitive: " + message);
    }

    // String
    public static void log(String message) {
        if (message.equals("str 1")) {
            last = message;
            state = "SUM";
            if (message == last) counter++;
            else if (last.equals("drop")) { print(message + " (x" + counter + ")"); }
            print(message);
        } else if (message.equals("str 2")) {
            state = "";
            print(String.valueOf(sum));
            print(message);
        } else
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

    private static void print(String message) {
        System.out.println(message);
    }

    public static void flush() {
        last = "drop";
        state = "";
    }
}
