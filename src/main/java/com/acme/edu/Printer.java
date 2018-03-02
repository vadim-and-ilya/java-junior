package com.acme.edu;

public class Printer {

    public static void prln(String message) {
        System.out.println(message);
    }

    public static void prn(String message) {
        System.out.print(message);
    }

    public static void nextString() {
        prln("");
    }

    public static void openArray(int length) {
        if (length > 0) {
            prln("{");
        }
    }

    public static void closeArray(int length) {
        if (length > 0) {
            prn("}");
        }
    }
}
