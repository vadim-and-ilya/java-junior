package com.acme.edu;

import java.util.ArrayList;

public class Buffer {

    private static ArrayList<Object> objectList = new ArrayList<>();
    public static Printer printer = new ConsolePrinter();

    private static void printBuffer() {
        for (Object current: objectList) {
            printer.out(current);
        }
    }

    public void save(Object message) {
        objectList.add(message.toString());
    }

    public static void flush() {
        Logger.log("");
        printBuffer();
        objectList.clear();
        Controller.setFirst(true);
    }

}
