package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOne = Integer.parseInt(scanner.nextLine());
        int numTwo = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0.0;
        String evenOrOdd = "";
        boolean isZero = false;

        switch (operator) {
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*":
                result = numOne * numTwo;
                break;
            case "/":
                if(numTwo == 0) {
                    isZero = true;
                } else {
                    result =numOne * 1.0 / numTwo;
                }
                break;
            case "%":
                if(numTwo == 0) {
                    isZero = true;
                } else {
                    result =numOne * 1.0 % numTwo;
                }
                break;
        }
        if (result % 2 == 0) {
            evenOrOdd = "even";
        } else {
            evenOrOdd = "odd";
        }

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s", numOne, operator, numTwo, result, evenOrOdd);
        } else if (operator.equals("/") && !isZero) {
            System.out.printf("%d / %d = %.2f", numOne, numTwo, result);
        } else if (operator.equals("%") && !isZero) {
            System.out.printf("%d %s %d = %.0f", numOne,operator, numTwo, result);
        } else {
            System.out.printf("Cannot divide %d by zero", numOne);
        }



    }
}
