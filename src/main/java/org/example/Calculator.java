package org.example;

public class Calculator {

    double add(double a, double b) {
        return a + b;
    }

    double sub(double a, double b) {
        return a - b;
    }

    double mul(double a, double b) {
        return a * b;
    }
    double div(double a, double b) {
        if (b == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
