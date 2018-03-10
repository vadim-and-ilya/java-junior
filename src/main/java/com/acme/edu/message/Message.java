package com.acme.edu.message;

import com.acme.edu.Buffer;
import com.acme.edu.Controller;
import com.acme.edu.formatter.FormatVisitor;

public interface Message {

    Controller controller = new Controller();
    Buffer buffer = new Buffer();

    String accept(FormatVisitor fv);

}
