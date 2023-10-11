package NestedLoops.Exercises;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = Integer.parseInt(scanner.nextLine());

        int countAllGrades = 0;
        double allGrades = 0;
        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String presentation = input;

            double sumCurrentGrades = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                countAllGrades++;
                sumCurrentGrades += currentGrade;
            }

            allGrades += sumCurrentGrades;
            double avgCurrentGrade = sumCurrentGrades / n;
            System.out.printf("%s - %.2f.%n", presentation, avgCurrentGrade);

            input = scanner.nextLine();
        }
        double finalGrade = allGrades / countAllGrades;
        System.out.printf("Student's final assessment is %.2f.", finalGrade);

    }
}
