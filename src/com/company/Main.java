package com.company;

/**
 * Test Driven Development (TDD)
 * Write your tests first and watch them fail.
 * Then write the algorithm and watch the tests pass.
 */
public class Main {
    public static void main(String[] args) {
        ReversePolishCalc rpc = new ReversePolishCalc();

        System.out.println("Testing the addition operation:");
        String rpnExpression = "2.5,4.8,+";
        double expectedResult = 7.3;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
        
        System.out.println("Testing the subtraction operation:");
        String rpnExpression = "6.0,4.8,-";
        double expectedResult = 1.2;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        System.out.println("Testing the multiplication operation:");
        String rpnExpression = "0.5,3.0,*";
        double expectedResult = 1.5;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

         System.out.println("Testing the division operation:");
        String rpnExpression = "81.0, 9.0,/";
        double expectedResult = 9.0;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);

        // Uncomment this test which has many operators
        String rpnExpression = "5,1,2,+,4,*,+,3,-";
        double expectedResult = 14.0;
        double actualResult = rpc.calculate(rpnExpression);
        checkResult(rpnExpression, expectedResult, actualResult);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
