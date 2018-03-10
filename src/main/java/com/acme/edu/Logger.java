package com.acme.edu;

import com.acme.edu.message.*;

public class Logger {

    private static Controller controller = new Controller();

    private static final String     CHAR = "char: ",
                                    PRIMITIVE = "primitive: ",
                                    STRING = "string: ",
                                    REFERENCE = "reference: ",
                                    ARRAY = "primitives array: ",
                                    MATRIX = "primitives matrix: ",
                                    MULTI_MATRIX = "primitives multimatrix: ",
                                    STRING_ARRAY = "string array: ",
                                    VARARG = "vararg: ";

    // PRIMITIVE
    public static void log(char message) {
        controller.direct(new CharMessage(message),CHAR);
    }

    public static void log(int message) {
        controller.direct(new IntegerMessage(message), PRIMITIVE);
    }

    public static void log(byte message) {
        controller.direct(new ByteMessage(message), PRIMITIVE);
    }

    public static void log(boolean message) {
        controller.direct(new BooleanMessage(message), PRIMITIVE);
    }

    // STRING
    public static void log(String message) {
        controller.direct(new StringMessage(message), STRING);
    }

    // REFERENCE
    public static void log(Object message) {
        controller.direct(new ObjectMessage(message),REFERENCE);
    }

    // Array
    public static void log(int[] message) {
        controller.direct(new IntArrayMessage(message), ARRAY);
    }

    // Matrix
    public static void log(int[][] message) {
        controller.direct(new IntMatrixMessage(message), MATRIX);
    }

    // Multi_Matrix
    public static void log(int[][][][] message) {
        controller.direct(new IntMultimatrixMessage(message), MULTI_MATRIX);
    }

    // String Array
    public static void log(String[] message) {
        controller.direct(new StringArrayMessage(message), STRING_ARRAY);
    }

    // Integer Vararg
    public static void log(int param, int... message) {
        controller.direct(new VarargMessage(param, message), VARARG);
    }

}