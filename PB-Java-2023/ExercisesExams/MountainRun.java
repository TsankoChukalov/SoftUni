package ExercisesExams;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSec = Double.parseDouble(scanner.nextLine());
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());

        double time = distanceInMeter * timeInSec;
        double resistance = Math.floor(distanceInMeter / 50 ) * 30;
        double totalTime = time + resistance;
        double diff = Math.abs(recordInSec - totalTime);

        if (totalTime >= recordInSec) {
            System.out.printf("No! He was %.2f seconds slower.", diff);
        } else {
            System.out.printf(" Yes! The new record is %.2f seconds.", totalTime);
        }
    }
}
