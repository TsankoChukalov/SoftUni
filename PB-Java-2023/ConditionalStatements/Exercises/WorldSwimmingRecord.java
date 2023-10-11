package ConditionalStatements.Exercises;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double slow = Math.floor(distance / 15);
        double resistance = slow * 12.5;

        double totalTime = (distance * timeInSeconds) + resistance;
        double missSec = Math.abs(totalTime - record);

        if (totalTime > record) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", missSec);
        } else {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }


    }
}
