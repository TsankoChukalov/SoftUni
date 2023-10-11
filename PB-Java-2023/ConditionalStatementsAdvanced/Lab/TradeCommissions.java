package ConditionalStatementsAdvanced.Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sumSales = Double.parseDouble(scanner.nextLine());

        double commission = -1;

        switch (town) {
            case "Sofia":

                if (sumSales >= 0 && sumSales <= 500) {
                    commission = sumSales * 0.05;
                } else if (sumSales > 500 && sumSales <= 1000) {
                    commission = sumSales * 0.07;
                } else if (sumSales > 1000 && sumSales <= 10000) {
                    commission = sumSales * 0.08;
                } else if (sumSales > 10000) {
                    commission = sumSales * 0.12;
                }
                break;
            case "Varna":

                if (sumSales >= 0 && sumSales <= 500) {
                    commission = sumSales * 0.045;
                } else if (sumSales > 500 && sumSales <= 1000) {
                    commission = sumSales * 0.075;
                } else if (sumSales > 1000 && sumSales <= 10000) {
                    commission = sumSales * 0.1;
                } else if (sumSales > 10000) {
                    commission = sumSales * 0.13;
                }
                break;
            case "Plovdiv":

                if (sumSales >= 0 && sumSales <= 500) {
                    commission = sumSales * 0.055;
                } else if (sumSales > 500 && sumSales <= 1000) {
                    commission = sumSales * 0.08;
                } else if (sumSales > 1000 && sumSales <= 10000) {
                    commission = sumSales * 0.12;
                } else if (sumSales > 10000) {
                    commission = sumSales * 0.145;
                }
                break;

        }

        if (commission > -1) {
            System.out.printf("%.2f", commission);
        } else {
            System.out.println("error");
        }


    }
}
