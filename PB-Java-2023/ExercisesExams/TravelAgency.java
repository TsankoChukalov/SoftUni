package ExercisesExams;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        String packageType = scanner.nextLine();
        String vipDiscount = scanner.nextLine();
        int daysToStay = Integer.parseInt(scanner.nextLine());

        double priceForDay = 0;
        double finalPrice = 0;

        switch (townName) {
            case "Bansko":
            case "Borovets":
              if (packageType.equals("withEquipment")) {
                  priceForDay = 100;
                  if (vipDiscount.equals("yes")) {
                      priceForDay = priceForDay * 0.90;
                  }
              } else if (packageType.equals("noEquipment")) {
                  priceForDay = 80;
                  if (vipDiscount.equals("yes")) {
                      priceForDay = priceForDay * 0.95;
                  }
              } else {
                  System.out.println("Invalid input!");
              }
                break;
            case "Varna":
            case "Burgas":
                if (packageType.equals("withBreakfast")) {
                    priceForDay = 130;
                    if (vipDiscount.equals("yes")) {
                        priceForDay = priceForDay * 0.88;
                    }
                } else if (packageType.equals("noBreakfast")) {
                    priceForDay = 100;
                    if (vipDiscount.equals("yes")) {
                        priceForDay = priceForDay * 0.93;
                    }
                } else {
                    System.out.println("Invalid input!");
                }
                break;

        }
        System.out.println("Invalid input!");

        finalPrice = priceForDay * daysToStay;
        if (daysToStay < 1) {
            System.out.println("Days must be positive number!");
        } else {
            System.out.printf("The price is %.2flv! Have a nice time!", finalPrice);
        }




    }
}
