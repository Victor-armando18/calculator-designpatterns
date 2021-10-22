package com.calculator.application.patterns.interpreter;

import com.calculator.application.patterns.visitor.Printer;

public class Sum implements Expression {

    private final Expression leftExpression;
    private final Expression rightExpression;

    public Sum(Expression esquerda, Expression direita) {
        this.leftExpression = esquerda;
        this.rightExpression = direita;
    }

    @Override
    public int getValue() {
        int leftValue = this.leftExpression.getValue();
        int rightValue = this.rightExpression.getValue();
        return leftValue + rightValue;
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
