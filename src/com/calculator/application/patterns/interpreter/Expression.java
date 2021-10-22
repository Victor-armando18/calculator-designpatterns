package com.calculator.application.patterns.interpreter;

import com.calculator.application.patterns.visitor.Printer;

public interface Expression {
    
    int getValue();
    void run(Printer printer);
}
