package ExercisesExams;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double fee = Double.parseDouble(scanner.nextLine());
        double loungerFee = Double.parseDouble(scanner.nextLine());
        double umbrellaFee = Double.parseDouble(scanner.nextLine());

        double entranceFee = people * fee;

        double lounger = Math.ceil(people * 0.75);
        double loungerPrice = lounger * loungerFee;

        double umbrella = Math.ceil(people * 0.50);
        double umbrellaPrice = umbrella * umbrellaFee;

        double totalPrice = entranceFee + loungerPrice + umbrellaPrice;

        System.out.printf("%.2f lv.", totalPrice);

    }
}
