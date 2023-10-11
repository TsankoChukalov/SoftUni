package NestedLoops.Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int I = 0;
        int J = 0;
        boolean isFound = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNum) {
                    isFound = true;
                    I = i;
                    J = j;
                    break;
                }

            }
            if (isFound) {
                break;
            }

        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, I, J, magicNum);
        } else {
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        }
    }
}
