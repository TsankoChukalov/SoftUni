package ExercisesExams;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int points = 0;
        int countRed = 0;
        int countOrange = 0;
        int countYellow = 0;
        int countWhite = 0;
        int countBlack = 0;
        int countOther = 0;

        for (int i = 1; i <= n; i++) {
            String colors = scanner.nextLine();

            if (colors.equals("red")) {
                points += 5;
                countRed++;
            } else if (colors.equals("orange")) {
                points += 10;
                countOrange++;
            } else if (colors.equals("yellow")) {
                points += 15;
                countYellow++;
            } else if (colors.equals("white")) {
                points += 20;
                countWhite++;
            } else if (colors.equals("black")) {
                points = points / 2;
                countBlack++;
            } else {
                countOther++;
            }

        }
        System.out.printf("Total points: %d\n", points);
        System.out.printf("Red balls: %d\n", countRed);
        System.out.printf("Orange balls: %d\n", countOrange);
        System.out.printf("Yellow balls: %d\n", countYellow);
        System.out.printf("White balls: %d\n", countWhite);
        System.out.printf("Other colors picked: %d\n", countOther);
        System.out.printf("Divides from black balls: %d", countBlack);

    }
}
