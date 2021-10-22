package com.calculator.application.patterns.visitor;

import com.calculator.application.patterns.interpreter.Multiplication;
import com.calculator.application.patterns.interpreter.Number;
import com.calculator.application.patterns.interpreter.Sum;

public class Printer{

    public void visit(Sum sum) {

        System.out.print("(");

        sum.getLeftExpression().run(this);

        System.out.print("+");

        sum.getRightExpression().run(this);

        System.out.print(")");
    }

    public void visit(Number number) {
        System.out.print(number.getValue());
    }

    public void visit(Multiplication multiplication) {
        System.out.print("(");

        multiplication.getLeftExpression().run(this);

        System.out.print("*");

        multiplication.getRightExpression().run(this);

        System.out.print(")");
    }


}
