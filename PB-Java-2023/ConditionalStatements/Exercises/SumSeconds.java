package ConditionalStatements.Exercises;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double slowDown = Math.floor(distance / 15);
        double resistance = slowDown * 12.5;
        double finalResult = (distance * timeInSec) + resistance;

        double missSec = Math.abs(record - finalResult);

        if (finalResult < record) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalResult);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", missSec);
        }


    }
}
