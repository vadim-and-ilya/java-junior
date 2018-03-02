package com.acme.edu;

public class Logger {

    // char
    public static void log(char message) {
        Controller.newMessage(new Message(message));
    }

    /* int
    public static void log(int message) {
        if (Controller.state.equals("SUM")) {
            if (message == Integer.MAX_VALUE) {
                Printer.prn(String.valueOf(Controller.sum));
                Printer.prn(String.valueOf(message));
                Buffer.flush();
            }
            else
            Controller.sum += message;
        }
        else
            Printer.prn("primitive: " + message);
    }
    */

    // byte
    public static void log(byte message) {
        Controller.newMessage(new Message(message));
        /*
        if (Controller.state.equals("SUM")) {
            if (message == Byte.MAX_VALUE) {
                Printer.prn(String.valueOf(Controller.sum));
                Printer.prn(String.valueOf(message));
                Flush.flush();
            }
            else
                Controller.sum += message;
        }
        else
        Printer.prn("primitive: " + message);
        */
    }


    /* String
    public static void log(String message) {
        if (message.equals("str 1")) {
            Controller.state = "SUM";
            Printer.prn(message);
        } else if (message.equals("str 2")) {
            Controller.state = "";
            Printer.prn(String.valueOf(Controller.sum));
            Printer.prn(message);
        } else
        Printer.prn("string: " + message);
    }
    */

    // boolean
    public static void log(boolean message) {
        Printer.prn("primitive: " + message);
    }

    // Object
    public static void log(Object message) {
        Printer.prn("reference: " + message);
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
