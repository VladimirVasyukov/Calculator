package com.epam.java_basic.calculator;

import java.util.Scanner;

public class Controller {
    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private static final char YES_ANSWER = 'y';
    private static final char NO_ANSWER = 'n';
    private final Calculator calculator;
    private final DisplayView displayView;
    private double firstNumber;
    private double secondNumber;
    private final Scanner calculatorScanner = new Scanner(System.in, "UTF-8");


    public Controller(Calculator calculator, DisplayView displayView) {
        this.calculator = calculator;
        this.displayView = displayView;
    }

    private void inputNumbers() {
        displayView.printInfo(DisplayView.ENTER_THE_FIRST_NUMBER);
        this.firstNumber = Double.parseDouble(calculatorScanner.nextLine());
        displayView.printInfo(DisplayView.ENTER_THE_SECOND_NUMBER);
        this.secondNumber = Double.parseDouble(calculatorScanner.nextLine());
    }


    public void inputOperator() {
        displayView.printInfo(DisplayView.ENTER_OPERATOR);
        char operator = calculatorScanner.nextLine().charAt(0);
        switch (operator) {
            case ADDITION:
                displayView.printResult(calculator.add(firstNumber, secondNumber));
                break;
            case SUBTRACTION:
                displayView.printResult(calculator.subtract(firstNumber, secondNumber));
                break;
            case MULTIPLICATION:
                displayView.printResult(calculator.subtract(firstNumber, secondNumber));
                break;
            case DIVISION:
                displayView.printResult(calculator.div(firstNumber, secondNumber));
                break;
            default:
                displayView.printInfo(DisplayView.OPERATOR_ERROR);
        }
    }

    public void fullCycleCalculation() {
        inputNumbers();
        inputOperator();
        displayView.printInfo(DisplayView.DO_YOU_WANT_TO_CONTINUE);
        char answer = calculatorScanner.nextLine().charAt(0);
        switch (answer) {
            case YES_ANSWER:
                inputNumbers();
                inputOperator();
                break;
            case NO_ANSWER:
                displayView.printInfo(DisplayView.BYE);
                break;
            default:
                displayView.printInfo(DisplayView.NOT_YES_OR_NO_ERROR);
        }
    }
}
