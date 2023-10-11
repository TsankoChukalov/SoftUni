package Exam;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int target = 8848;
        int reachedHeight = 5364;
        int day = 1;


        while (!command.equals("END")) {
            if (command.equals("Yes")) {
                day++;
                command = scanner.nextLine();
                continue;
            } else if (command.equals("No")){
                command = scanner.nextLine();
                int currentHeight = Integer.parseInt(command);
                reachedHeight +=currentHeight;
            } else {
                int currentHeight = Integer.parseInt(command);
                reachedHeight += currentHeight;
            }
            if (day == 5) {
                break;
            } else if (reachedHeight >= target) {
                break;
            }

            command = scanner.nextLine();
        }
        if (reachedHeight >= target) {
            System.out.printf("Goal reached for %d days!", day);
        } else {
            System.out.println("Failed!");
            System.out.printf("%d", reachedHeight);
        }


    }
}
