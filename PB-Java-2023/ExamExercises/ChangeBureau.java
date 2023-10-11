package ExamExercises;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double uan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinPrice = bitcoin * 1168;
        double uanPrice = (uan * 0.15) * 1.76;

        double totalPrice = (bitcoinPrice + uanPrice) / 1.95;
        double commissionPrice = totalPrice * (commission / 100);
        double finalPrice = totalPrice - commissionPrice;

        System.out.printf("%.2f", finalPrice);


    }
}
