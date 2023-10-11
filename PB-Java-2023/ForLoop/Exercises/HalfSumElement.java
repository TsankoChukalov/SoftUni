package ForLoop.Exercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNumber = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;

            if (maxNumber < number) {
                maxNumber = number;
            }
        }
        sum -= maxNumber;
        int diff = Math.abs(sum - maxNumber);

        if (sum == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }


    }
}
