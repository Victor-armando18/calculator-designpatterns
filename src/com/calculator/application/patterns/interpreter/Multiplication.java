package com.calculator.application.patterns.interpreter;

import com.calculator.application.patterns.visitor.Printer;

public class Multiplication implements Expression{

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Multiplication(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public int getValue() {
        int leftValue = this.leftExpression.getValue();
        int rightValue = this.rightExpression.getValue();
        return leftValue * rightValue;
    }

    public Expression getRightExpression() {
        return rightExpression;
    }

    public Expression getLeftExpression() {
        return leftExpression;
    }

    @Override
    public void run(Printer printer) {
        printer.visit(this);
    }
    
}
