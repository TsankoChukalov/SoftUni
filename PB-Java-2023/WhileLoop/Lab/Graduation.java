package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int years = 1;
        double sumGrade = 0;
        int poorGrade = 0;
        while (years <= 12) {

            if (poorGrade > 1) {
                break;
            }
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade < 4) {
                poorGrade++;
                continue;
            }

            sumGrade = sumGrade + grade;
            years++;


        }
        if (poorGrade > 1) {
            System.out.printf("%s has been excluded at %d grade", studentName, years);
        } else {
            double avgGrade = sumGrade / 12;
            System.out.printf("%s graduated. Average grade: %.2f", studentName, avgGrade);
        }


    }
}
