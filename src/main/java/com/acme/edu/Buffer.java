package com.acme.edu;

import java.util.ArrayList;

public class Buffer {

    public static String previousType;
    public static int count = 1;

    private static ArrayList<String> stringToOut = new ArrayList<String>();

    public static void printBuffer() {
        for (String line: stringToOut) {
            Printer.prln(line);
        }
    }

    public static void flush() {
        printBuffer();
    }

    public static String getLastLine() {
        return stringToOut.get(stringToOut.size()-1);
    }

    // ------------------------------

    public void save(Object message) {
        stringToOut.add(String.valueOf(message));
    }

}
