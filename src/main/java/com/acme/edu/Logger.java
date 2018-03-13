package com.acme.edu;

import com.acme.edu.message.*;
import com.sun.istack.internal.NotNull;

public class Logger {

    private static Controller controller = new Controller();

    // PRIMITIVE
    public static void log(@NotNull char message) {
        controller.direct(new CharMessage(message),false);
    }

    public static void log(@NotNull int message) {
        controller.direct(new IntegerMessage(message), false);
    }

    public static void log(@NotNull byte message) {
        controller.direct(new ByteMessage(message), false);
    }

    public static void log(@NotNull boolean message) {
        controller.direct(new BooleanMessage(message), false);
    }

    // STRING
    public static void log(@NotNull String message) {
        controller.direct(new StringMessage(message), true);
    }

    // REFERENCE
    public static void log(@NotNull Object message) {
        controller.direct(new ObjectMessage(message),false);
    }

    // Array
    public static void log(@NotNull int[] message) {
        controller.direct(new IntArrayMessage(message), false);
    }

    // Matrix
    public static void log(@NotNull int[][] message) {
        controller.direct(new IntMatrixMessage(message), false);
    }

    // Multi_Matrix
    public static void log(@NotNull int[][][][] message) {
        controller.direct(new IntMultimatrixMessage(message), false);
    }

    // String Array
    public static void log(@NotNull String[] message) {
        controller.direct(new StringArrayMessage(message), false);
    }

    // Integer Vararg
    public static void log(@NotNull int param, int... message) {
        controller.direct(new VarargMessage(param, message), false);
    }

}