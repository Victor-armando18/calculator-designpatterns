package com.calculator.application.main;

import com.calculator.application.patterns.interpreter.Expression;
import com.calculator.application.patterns.interpreter.Multiplication;
import com.calculator.application.patterns.interpreter.Number;
import com.calculator.application.patterns.interpreter.Sum;
import com.calculator.application.patterns.visitor.Printer;

public class Test {
   
    public static void main(String[] args) {
        
        Expression firstResult = new Multiplication(new Number(10), new Number(10));
        Expression secondResult = new Multiplication(new Number(5), new Number(5));
        Expression thirdResult = new Sum(firstResult, new Number(10));
        Expression finalResult = new Sum(thirdResult, secondResult);
        
        System.out.println(finalResult.getValue());
        
        Printer printer = new Printer();
        finalResult.run(printer);
        
        System.out.println();
    }
}
