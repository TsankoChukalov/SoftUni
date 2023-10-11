package ForLoop.Exercises;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());

        int winTour = 0;
        double pointsFromTour = 0;
        for (int i = 1; i <= n; i++) {

            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    points += 2000;
                    pointsFromTour += 2000;
                    winTour++;
                    break;
                case "F":
                    points += 1200;
                    pointsFromTour += 1200;
                    break;
                case "SF":
                    points += 720;
                    pointsFromTour += 720;
                    break;
            }
        }

        double winPercent = winTour * 1.0 / n * 100;
        double averagePoints = Math.floor(pointsFromTour / n);

        System.out.printf("Final points: %d\n", points);
        System.out.printf("Average points: %.0f\n", averagePoints);
        System.out.printf("%.2f%%", winPercent);

    }
}
