package com.calculator.application.patterns.interpreter;

import com.calculator.application.patterns.visitor.Printer;

public class Number implements Expression {

    private final int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int getValue() {
        return this.number;
    }

    @Override
    public void run(Printer printer) {
        printer.visit(this);
    }

}
