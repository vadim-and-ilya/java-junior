package com.acme.edu.formatter;

import com.acme.edu.message.*;

public interface FormatVisitor {

    default void format(Message message) {
        message.accept(this);
    };

    void formatInt(IntegerMessage message);
    void formatByte(ByteMessage message);
    void formatChar(CharMessage message);
    void formatBoolean(BooleanMessage message);
    void formatString(StringMessage message);
    void formatObject(ObjectMessage message);

    void formatIntArray(IntArrayMessage message);
    void formatIntMatrix(IntMatrixMessage message);
    void formatIntMultiMatrix(IntMultimatrixMessage message);
    void formatStringArray(StringArrayMessage message);
    void formatVararg(VarargMessage message);

}
