package com.epam.java_basic;

import com.epam.java_basic.calculator.Calculator;
import com.epam.java_basic.calculator.Controller;
import com.epam.java_basic.calculator.DisplayView;


/**
 * 01_Java_Basic - Vladimir Vasyukov
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public void run(String[] args) {
        int precision = Integer.parseInt(args[0]);
        Controller controller = new Controller(new Calculator(precision), new DisplayView());
        controller.fullCycleCalculation();
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run(args);
    }

}
