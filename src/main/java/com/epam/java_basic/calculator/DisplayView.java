package com.epam.java_basic.calculator;

public class DisplayView {
    protected static final String ENTER_THE_FIRST_NUMBER = "Enter the first number: ";
    protected static final String ENTER_THE_SECOND_NUMBER = "Enter the second number: ";
    protected static final String ENTER_OPERATOR = "Enter operator (+, -, *, /): ";
    protected static final String RESULT = "Result: ";
    protected static final String DO_YOU_WANT_TO_CONTINUE = "Do you want to continue? (Y/N)";
    protected static final String OPERATOR_ERROR = "Unknown operator";
    protected static final String NOT_YES_OR_NO_ERROR = "Unsupported answer";
    protected static final String BYE = "Bye!";

    public void printInfo(String info) { System.out.printf("%s%n", info); }

    public void printResult(double result) { System.out.printf("%s: %s%n", RESULT, result); }

}
