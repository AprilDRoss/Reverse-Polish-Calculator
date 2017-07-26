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
        String rpnExpressionAddition = "2.5,4.8,+";
        double expectedResultAddition = 7.3;
        double actualResultAddition = rpc.calculate(rpnExpressionAddition);
        checkResult(rpnExpressionAddition, expectedResultAddition, actualResultAddition);

        System.out.println("Testing the subtraction operation:");
        String rpnExpressionSubtraction = "6.0,4.8,-";
        double expectedResultSubtraction = 1.2;
        double actualResultSubtraction = rpc.calculate(rpnExpressionSubtraction);
        checkResult(rpnExpressionSubtraction, expectedResultSubtraction, actualResultSubtraction);

        System.out.println("Testing the multiplication operation:");
        String rpnExpressionMultiplication = "0.5,3.0,*";
        double expectedResultMultiplication = 1.5;
        double actualResultMultiplication = rpc.calculate(rpnExpressionMultiplication);
        checkResult(rpnExpressionMultiplication, expectedResultMultiplication, actualResultMultiplication);

         System.out.println("Testing the division operation:");
        String rpnExpressionDivision = "81.0, 9.0,/";
        double expectedResultDivision = 9.0;
        double actualResultDivision = rpc.calculate(rpnExpressionDivision);
        checkResult(rpnExpressionDivision, expectedResultDivision, actualResultDivision);

        // Uncomment this test which has many operators
        String rpnExpressionFinal = "5,1,2,+,4,*,+,3,-";
        double expectedResultFinal = 14.0;
        double actualResultFinal = rpc.calculate(rpnExpressionFinal);
        checkResult(rpnExpressionFinal, expectedResultFinal, actualResultFinal);
    }

    private static void checkResult(String expression, double expected, double actual) {
        if (expected == actual) {
            System.out.println("SUCCESS: " + expression + " is " + expected);
        } else {
            System.out.println("ERROR: " + expression + " expected " + expected + " actual " + actual);
        }
    }
}
