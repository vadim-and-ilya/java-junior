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

    /* Iteration3 */

    // Array
    public static void log(int[] message) {
        Printer.prln("primitives array: ");
        arrayFor(message);
    }

    // 2D Array
    public static void log(int[][] message) {
        Printer.prln("primitives matrix: ");
        array2dFor(message);
    }

    // 3D Array
    public static void log(int[][][] message) {
        Printer.prln("primitives multimatrix: ");
        array3dFor(message);
    }

    // 4D Array
    public static void log(int[][][][] message) {
        Printer.prln("primitives multimatrix: ");

        Printer.openArray(message.length);
        for (int i = 0; i < message.length; i++) {
            array3dFor(message[i]);
        }
        Printer.closeArray(message.length);

    }

    // String Array
    public static void log(String[] message) {
        for (String current: message) {
            Printer.prn(current);
        }
    }

    // endregion

    // region Array Methods
    private static void arrayFor(int[] array) {
        Printer.openArray(array.length);
        for (int i = 0; i < array.length; i++) {
            Printer.prln(String.valueOf(array[i]));
            if (i < array.length - 1) {
                Printer.prln(", ");
            }
        }
        Printer.closeArray(array.length);
    }

    private static void array2dFor(int[][] array) {
        Printer.openArray(array.length);
        for (int i = 0; i < array.length; i++) {
            arrayFor(array[i]);
        }
        Printer.closeArray(array.length);
    }

    private static void array3dFor(int[][][] array) {
        Printer.openArray(array.length);
        for (int i = 0; i < array.length; i++) {
            array2dFor(array[i]);
        }
        Printer.closeArray(array.length);
    }

    private static void array4dFor(int[][][][] array) {
        Printer.openArray(array.length);
        for (int i = 0; i < array.length; i++) {
            array3dFor(array[i]);
        }
        Printer.closeArray(array.length);
    }

    // endregion

}
