package com.acme.edu.formatter;

import com.acme.edu.message.*;

public interface FormatVisitor {

    default String format(Message message) {
        return message.accept(this);
    };

    String formatInt(IntegerMessage message);

}
