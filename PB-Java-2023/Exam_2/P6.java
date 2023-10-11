package Exam_2;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numLocation = Integer.parseInt(scanner.nextLine());

        double allYield = 0;

        for (int i = 1; i <= numLocation; i++) {
            double averageYield = Double.parseDouble(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());
            for (int j = 1; j <= day; j++) {
                double yieldPerDay = Double.parseDouble(scanner.nextLine());

                allYield += yieldPerDay;

            }
            double averageYieldForLocation = allYield / day;


            if (averageYieldForLocation >= averageYield) {
                allYield = 0;
                System.out.printf("Good job! Average gold per day: %.2f.\n", averageYieldForLocation);
            }
            if (averageYieldForLocation < averageYield) {
                allYield = 0;
                System.out.printf("You need %.2f gold.\n", averageYield - averageYieldForLocation);
            }

        }

    }
}
