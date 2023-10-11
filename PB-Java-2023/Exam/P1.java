package Exam;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int human = Integer.parseInt(scanner.nextLine());
        int numOfNights = Integer.parseInt(scanner.nextLine());
        int card = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double priceForOnePerson = numOfNights * 20.0;
        double cardPrice = card * 1.60;
        double ticketPrice = tickets * 6.0;
        double allPriceForOnePerson = priceForOnePerson + cardPrice + ticketPrice;
        double allGroupPrice = allPriceForOnePerson * human;
        double totalPrice = allGroupPrice * 1.25;

        System.out.printf("%.2f", totalPrice);

    }
}
