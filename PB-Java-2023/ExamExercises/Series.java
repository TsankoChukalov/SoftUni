package ExamExercises;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        double moviePrice = 0;

        for (int i = 1; i <= n; i++) {
            String movieName = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());

            switch (movieName) {
                case "Thrones":
                    price = price * 0.50;
                    break;
                case "Lucifer":
                    price = price * 0.60;
                    break;
                case "Protector":
                    price = price * 0.70;
                    break;
                case "TotalDrama":
                    price = price * 0.80;
                    break;
                case "Area":
                    price = price * 0.90;
                    break;
            }
            moviePrice += price;

        }
        if (budget >= moviePrice) {
            System.out.printf("You bought all the series and left with %.2f lv.", budget - moviePrice);
        } else {
            System.out.printf("You need %.2f lv. more to buy the series!", moviePrice - budget);
        }


    }
}
