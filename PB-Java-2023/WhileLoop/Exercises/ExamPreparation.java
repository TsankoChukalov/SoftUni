package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxBadGrade = Integer.parseInt(scanner.nextLine());

        int badGrade = 0;
        int gradeCount = 0;
        double gradeSum = 0;
        String lastProblem = "";
        boolean isFailed = true;

        while (badGrade < maxBadGrade) {
            String problemName = scanner.nextLine();
            if ("Enough".equals(problemName)) {
                isFailed = false;
                break;
            }
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4) {
                badGrade++;
            }
            gradeCount++;
            gradeSum = gradeSum + grade;
            lastProblem = problemName;
        }
        double averageScore = gradeSum / gradeCount;
        if (isFailed) {
            System.out.printf("You need a break, %d poor grades.", badGrade);
        } else {
            System.out.printf("Average score: %.2f\n", averageScore);
            System.out.printf("Number of problems: %d\n", gradeCount);
            System.out.printf("Last problem: %s", lastProblem);
        }


    }
}
