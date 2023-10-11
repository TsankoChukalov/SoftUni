package WhileLoop.Exercises;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double currentSum = Math.round(sum * 100);
        int coins = 0;
        while (currentSum > 0) {
            if (currentSum >= 200) {
                currentSum = currentSum - 200;
                coins++;
            } else if (currentSum >= 100) {
                currentSum = currentSum - 100;
                coins++;
            } else if (currentSum >= 50) {
                currentSum = currentSum - 50;
                coins++;
            } else if (currentSum >= 20) {
                currentSum = currentSum - 20;
                coins++;
            } else if (currentSum >= 10) {
                currentSum = currentSum - 10;
                coins++;
            } else if (currentSum >= 5) {
                currentSum = currentSum - 5;
                coins++;
            } else if (currentSum >= 2) {
                currentSum = currentSum - 2;
                coins++;
            } else if (currentSum >= 1) {
                currentSum = currentSum - 1;
                coins++;
            }
        }
        System.out.println(coins);

    }
}
