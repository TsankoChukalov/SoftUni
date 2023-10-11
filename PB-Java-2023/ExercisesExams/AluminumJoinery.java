package ExercisesExams;

import java.util.Scanner;

public class AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numJoinery = Integer.parseInt(scanner.nextLine());
        String typeJoinery = scanner.nextLine();
        String delivery = scanner.nextLine();
        double price = 0;
        double totalSum = 0;

        switch (typeJoinery) {
            case "90X130":
                price = 110;
                if (numJoinery > 30 && numJoinery < 60) {
                    price *= 0.95;
                } else if (numJoinery > 60) {
                    price *= 0.92;
                }
                break;
            case "100X150":
                price = 140;
                if (numJoinery > 40 && numJoinery < 80) {
                    price *= 0.94;
                } else if (numJoinery > 80) {
                    price *= 0.90;
                }
                break;
            case "130X180":
                price = 190;
                if (numJoinery > 20 && numJoinery < 50) {
                    price *= 0.93;
                } else if (numJoinery > 50) {
                    price *= 0.88;
                }
                break;
            case "200X300":
                price = 250;
                if (numJoinery > 25 && numJoinery < 50) {
                    price *= 0.91;
                } else if (numJoinery > 50) {
                    price *= 0.86;
                }
                break;


        }

        totalSum = price * numJoinery;

        if (delivery.equals("With delivery")) {
            totalSum += 60;
        }
        if (numJoinery > 99) {
            totalSum *= 0.96;
        }
        if (numJoinery < 10) {
            System.out.println("Invalid order");
        } else {
            System.out.printf("%.2f BGN", totalSum);
        }


    }
}
