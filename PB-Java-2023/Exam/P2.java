package Exam;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partiPrice = Double.parseDouble(scanner.nextLine());
        int loveMessages = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keychain = Integer.parseInt(scanner.nextLine());
        int caricature = Integer.parseInt(scanner.nextLine());
        int luckySurprise = Integer.parseInt(scanner.nextLine());


        double messagesPrice = loveMessages * 0.6;
        double rosesPrice = roses * 7.20;
        double keychainPrice = keychain * 3.60;
        double caricaturePrice = caricature * 18.20;
        double luckySurprisePrice = luckySurprise * 22.0;
        double allItemsPrice = messagesPrice + rosesPrice + keychainPrice + caricaturePrice + luckySurprisePrice;
        double allItems = loveMessages + roses + keychain + caricature + luckySurprise;

        if (allItems >= 25) {
            allItemsPrice = allItemsPrice * 0.65;
        }
        double totalPrice = allItemsPrice * 0.90;
        double diff = Math.abs(partiPrice - totalPrice);

        if (partiPrice <= totalPrice) {
            System.out.printf("Yes! %.2f lv left.", diff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }
    }
}
