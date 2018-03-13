package com.acme.edu;

public class ConsolePrinter implements Printer {

    @Override
    public void out(Object lineToPrint) {
        System.out.println(lineToPrint);
    }

    @Override
    public void outPrefix(String prefix) {
        System.out.print(prefix);
    }

}
