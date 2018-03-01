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
    public static void log(int... message) {
        String out = "primitives array: {";
        for (int current = 0; current < message.length; current++) {
            if (current < message.length-1) {
                out += message[current];
                out += ", ";
            } else {
                out += message[current];
            }
        }
        out += "}";
        print(out);
    }

    // Array int[][]
    public static void log(int[]... message) {
        print("primitives matrix: {" + message.length);
        for (int i = 0; i < message.length; i++) {
            String out = "{";
            for (int j = 0; j < message[i].length; j++) {
                if (j < message[i].length-1) {
                    out += message[i][j] + ", ";
                } else {
                    out += message[i][j];
                }
            }
            out += "}";
            print(out);
        }
        print("}");
    }

    // Array int[][][][]
    public static void log(int[][][]... message) {
        System.out.print("primitives multimatrix: ");

        if (message.length > 0) print("{");
        for (int i = 0; i < message.length; i++) {

            if (message[i].length > 0) print("{");
            for (int j = 0; j < message[i].length; j++) {

                if (message[i][j].length > 0) print("{");
                for (int k = 0; k < message[i][j].length; k++) {

                    if (message[i][j][k].length > 0) print("{");
                    for (int l = 0; l < message[i][j][k].length; l++) {
                        print(String.valueOf(message[i][j][k][l]));
                    }
                    if (message[i][j][k].length > 0) print("}");
                }
                if (message[i][j].length > 0) print("}");
            }
            if (message[i].length > 0) print("}");
        }
        if (message.length > 0) print("}");

    }


    private static void print(String message) {
        System.out.println(message);
    }

    public static void flush() {
        sum = 0;
        state = "";
    }
}
