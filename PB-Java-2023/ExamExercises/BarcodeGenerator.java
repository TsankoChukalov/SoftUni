package ExamExercises;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        int num1 = start % 10;
        int num2 = start / 10 % 10;
        int num3 = start / 100 % 10;
        int num4 = start / 1000 % 10;

        int num1End = end % 10;
        int num2End = end / 10 % 10;
        int num3End = end / 100 % 10;
        int num4End = end / 1000 % 10;


        for (int i = num4; i <= num4End; i++) {

            for (int j = num3; j <= num3End; j++) {

                for (int k = num2; k <= num2End; k++) {

                    for (int l = num1; l <= num1End; l++) {

                        boolean isOdd = i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0;

                        if (isOdd) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }


                    }


                }

            }

        }

    }
}