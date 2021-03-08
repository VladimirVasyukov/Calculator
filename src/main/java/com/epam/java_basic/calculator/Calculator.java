package com.epam.java_basic.calculator;

public class Calculator {
    private static final double PRECISION_CALCULAOTR = 10;
    private final int precision;

    public Calculator(int precision) { this.precision = precision; }

    public double add(double a, double b) {
       double addResult = a + b;
       if (Double.isFinite(addResult)) {
           addResult = applyPrecision(addResult);
       }
       return addResult;
    }

    public double subtract(double a, double b) {
        double subResult  = a - b;
        if (Double.isFinite(subResult)) {
            subResult = applyPrecision(subResult);
        }
        return subResult;
    }

    public double multiply(double a, double b) {
        return applyPrecision (a * b);
    }

    public double div(double a, double b) {
      double divResult = a / b;
      if (Double.isFinite(divResult)) {
          divResult = applyPrecision(divResult);
      }
      return divResult;
    }

    private double applyPrecision (double calculationResult) {
        return Math.round(calculationResult * Math.pow(PRECISION_CALCULAOTR, precision)) /
            Math.pow(PRECISION_CALCULAOTR, precision);
    }

}
