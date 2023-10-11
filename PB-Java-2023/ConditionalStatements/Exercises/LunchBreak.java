package ConditionalStatements.Exercises;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serialName = scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int breakInMinutes = Integer.parseInt(scanner.nextLine());

        double lunchTime = breakInMinutes / 8.0;
        double timeForRelax = breakInMinutes / 4.0;
        double remainingTime = breakInMinutes - lunchTime - timeForRelax;

        double difference = Math.abs(remainingTime - episodeTime);

        if (remainingTime >= episodeTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", serialName, Math.ceil(difference));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serialName, Math.ceil(difference));
        }

    }
}
