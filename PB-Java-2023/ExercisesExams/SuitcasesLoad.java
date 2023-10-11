package ExercisesExams;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();
        int count = 0;
        int allSuitcase = 0;
        double sumSuitcase = 0;
        while (!command.equals("End")) {
            double volume = Double.parseDouble(command);
            count++;

            if (count == 3) {
                volume = volume + volume * 0.10;
                count = 0;
            }
            sumSuitcase += volume;
            if (sumSuitcase > capacity) {
                System.out.println("No more space!");
                break;
            }
            allSuitcase++;

            command = scanner.nextLine();
        }
        if (capacity >= sumSuitcase) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.printf("Statistic: %d suitcases loaded.", allSuitcase);


    }
}
