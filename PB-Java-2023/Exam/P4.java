package Exam;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double allDegreesForDay = 0;
        double allDegrees = 0;
        double quantityBrandy = 0;

        for (int i = 1; i <= n; i++) {
            double quantity = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());

            quantityBrandy += quantity;

            allDegreesForDay = quantity * degrees;
            allDegrees += allDegreesForDay;

        }
        double averageDegrees = allDegrees / quantityBrandy;

        System.out.printf("Liter: %.2f\n", quantityBrandy);
        System.out.printf("Degrees: %.2f\n", averageDegrees);
        if (averageDegrees < 38) {
            System.out.print("Not good, you should baking!");
        } else if (averageDegrees <= 42) {
            System.out.print("Super!");
        } else {
            System.out.print("Dilution with distilled water!");
        }
    }
}
