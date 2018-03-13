package com.acme.edu.formatter;

import com.acme.edu.Buffer;
import com.acme.edu.Printer;
import com.acme.edu.message.*;

public class PrefixFormatter implements FormatVisitor {

    Printer printer = Buffer.printer;

    @Override
    public void formatInt(IntegerMessage message) {
        printer.outPrefix("primitive: ");
    }

    @Override
    public void formatByte(ByteMessage message) {
        printer.outPrefix("primitive: ");
    }

    @Override
    public void formatChar(CharMessage message) {
        printer.outPrefix("char: ");
    }

    @Override
    public void formatBoolean(BooleanMessage message) {
        printer.outPrefix("primitive: ");
    }

    @Override
    public void formatString(StringMessage message) {
        if(!message.equals("") || message != null) {
            printer.outPrefix("string: ");
        }
    }

    @Override
    public void formatObject(ObjectMessage message) {
        printer.outPrefix("reference: ");
    }

    @Override
    public void formatIntArray(IntArrayMessage message) {
        printer.outPrefix("primitives array: ");
    }

    @Override
    public void formatIntMatrix(IntMatrixMessage message) {
        printer.outPrefix("primitives matrix: ");
    }

    @Override
    public void formatIntMultiMatrix(IntMultimatrixMessage message) {
        printer.outPrefix("primitives multimatrix: ");
    }


    @Override
    public void formatStringArray(StringArrayMessage message) {
        printer.outPrefix("string array: ");
    }

    @Override
    public void formatVararg(VarargMessage message) {
        printer.outPrefix("vararg: ");
    }

}
