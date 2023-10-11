package ExercisesExams;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startRange = Integer.parseInt(scanner.nextLine());
        int endRange = Integer.parseInt(scanner.nextLine());

        char[] startRangeDigits = String.valueOf(startRange).toCharArray();
        char[] endRangeDigits = String.valueOf(endRange).toCharArray();

        int firstDigStart = Integer.parseInt(String.valueOf(startRangeDigits[0]));
        int secondDigStart = Integer.parseInt(String.valueOf(startRangeDigits[1]));
        int thirdDigStart = Integer.parseInt(String.valueOf(startRangeDigits[2]));
        int forthDigStart = Integer.parseInt(String.valueOf(startRangeDigits[3]));

        int firstDigEnd = Integer.parseInt(String.valueOf(endRangeDigits[0]));
        int secondDigEnd = Integer.parseInt(String.valueOf(endRangeDigits[1]));
        int thirdDigEnd = Integer.parseInt(String.valueOf(endRangeDigits[2]));
        int forthDigEnd = Integer.parseInt(String.valueOf(endRangeDigits[3]));

        for (int i = firstDigStart; i <= firstDigEnd; i++) {
            if (i % 2 != 0 ) {
                for (int j = secondDigStart; j <= secondDigEnd; j++) {
                    if (j % 2 != 0 ) {
                        for (int k = thirdDigStart; k <= thirdDigEnd; k++) {
                            if (k % 2 != 0 ) {
                                for (int l = forthDigStart; l <= forthDigEnd; l++) {
                                    if (l % 2 != 0 ) {

                                        String num1 = Integer.toString(i);
                                        String num2 = Integer.toString(j);
                                        String num3 = Integer.toString(k);
                                        String num4 = Integer.toString(l);

                                        String finalNumString = num1 + num2 + num3 + num4;

                                        int finalNum = Integer.parseInt(finalNumString);

                                        System.out.printf("%d ", finalNum);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


    }
}
