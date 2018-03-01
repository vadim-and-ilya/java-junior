package com.acme.edu;

public class Logger {

    static String state = "";
    static int sum = 0;

    // char
    public static void log(char message) {
        print("char: " + message);
    }

    // int
    public static void log(int message) {
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
            state = "SUM";
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

    // Array int[]
    public static void log(int[] message) {
        System.out.print("primitives array: ");
        iterate(message);
    }

    // Array int[][]
    public static void log(int[][] message) {
        out("primitives matrix: ");
        iterateTwoLayers(message);
    }

    // Array int[][][][]
    public static void log(int[][][][] message) {
        System.out.print("primitives multimatrix: ");

        openIterate(message.length);
        for (int i = 0; i < message.length; i++) {

            openIterate(message[i].length);
            for (int j = 0; j < message[i].length; j++) {
                iterateTwoLayers(message[i][j]);
            }
            closeIterate(message[i].length);
        }
        closeIterate(message.length);

    }


    private static void out(String message) {
        System.out.print(message);
    }
    private static void print(String message) {
        System.out.println(message);
    }
    private static void nextString() {
        print("");
    }

    private static void iterate(int[] array) {
        openIterate(array.length);
        for (int i = 0; i < array.length; i++) {
            out(String.valueOf(array[i]));
            if (i < array.length - 1) {
                out(", ");
            }
        }
        closeIterate(array.length);
    }

    private static void iterateTwoLayers(int[][] array) {
        openIterate(array.length);
        for (int i = 0; i < array.length; i++) {
            iterate(array[i]);
        }
        closeIterate(array.length);
    }

    private static void openIterate(int length) {
        if (length > 0) {
            out("{");
        }
    }
    private static void closeIterate(int length) {
        if (length > 0) {
            print("}");
        }
    }

    public static void flush() {
        sum = 0;
        state = "";
    }


}
