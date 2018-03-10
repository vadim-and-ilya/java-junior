package com.acme.edu;

import com.sun.org.apache.xpath.internal.SourceTree;

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
