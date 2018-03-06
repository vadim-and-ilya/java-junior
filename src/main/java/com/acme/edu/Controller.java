package com.acme.edu;

public class Controller {

    private Buffer buffer = new Buffer();
    private static boolean calc = false;
    private static boolean first = true;

    private static int sumInt = 0;
    private static byte sumByte = 0;
    private static int counter = 1;
    private static String temporary = null;

    public void direct(Object message, String prefix) {

        // Является ли вызов первым
        // Если первый вызов типа String, включаем вычисления для iteration2
        if (first) {
            Buffer.printer.outPrefix(prefix);
            first = false;
            if (prefix.equals("string: ")) {
                calc = true;
            }
        }

    }

    //region GETTER & SETTER
    public static boolean getCalc() {
        return calc;
    }
    public static void setFirst(boolean value) {
        first = value;
    }

    public int getSumInt() {
        return sumInt;
    }
    public void setSumInt(int sumInt) {
        this.sumInt = sumInt;
    }
    public void enlargeSumInt(int term) {
        sumInt += term;
    }

    public byte getSumByte() {
        return sumByte;
    }
    public void setSumByte(byte sumByte) {
        this.sumByte = sumByte;
    }
    public void enlargeSumByte(byte term) { sumByte += term; }

    public int getCounter() {
        return counter;
    }
    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getTemporary() {
        return temporary;
    }
    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }
    //endregion

}
