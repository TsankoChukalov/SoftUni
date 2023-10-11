package NestedLoops.Exercises;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i = num1; i <= num2; i++) {
            String currentNum = "" + i;
            int odd = 0;
            int even = 0;
            for (int j = 0; j < currentNum.length(); j++) {
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if (j % 2 == 0) {
                    even += currentDigit;
                } else {
                    odd += currentDigit;
                }

            }
            if (odd == even) {
                System.out.printf("%d ", i);
            }
        }


    }
}
