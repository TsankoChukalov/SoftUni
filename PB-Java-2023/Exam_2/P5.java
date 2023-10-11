package Exam_2;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        int kidsCounter = 0;
        int oldCounter = 0;


        while (!command.equals("Christmas")) {
            int years = Integer.parseInt(command);

            if (years <= 16) {
                kidsCounter++;
            } else {
                oldCounter++;
            }




            command = scanner.nextLine();
        }
        int toysPrice = kidsCounter * 5;
        int  sweatersPrice = oldCounter * 15;

        System.out.printf("Number of adults: %d\n", oldCounter);
        System.out.printf("Number of kids: %d\n", kidsCounter);
        System.out.printf("Money for toys: %d\n", toysPrice);
        System.out.printf("Money for sweaters: %d", sweatersPrice);

    }
}
