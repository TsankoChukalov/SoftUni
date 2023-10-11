package Exam;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int day = Integer.parseInt(scanner.nextLine());
        String typeOfRoom = scanner.nextLine();
        String grade = scanner.nextLine();

        double numOfNights = day - 1;
        double totalPrice = 0;

        switch (typeOfRoom) {
            case "room for one person":
                totalPrice = numOfNights * 18;
                break;
            case "apartment":
                totalPrice = numOfNights * 25;
                if (day < 10) {
                    totalPrice = totalPrice * 0.7;
                } else if (day <= 15) {
                    totalPrice = totalPrice * 0.65;
                } else {
                    totalPrice = totalPrice * 0.50;
                }
                break;
            case "president apartment":
                totalPrice = numOfNights * 35;
                if (day < 10) {
                    totalPrice = totalPrice * 0.90;
                } else if (day <= 15) {
                    totalPrice = totalPrice * 0.85;
                } else {
                    totalPrice = totalPrice * 0.80;
                }
                break;
        }
        if (grade.equals("positive")) {
            totalPrice = totalPrice * 1.25;
        } else {
            totalPrice = totalPrice * 0.90;
        }
        System.out.printf("%.2f", totalPrice);

    }
}
