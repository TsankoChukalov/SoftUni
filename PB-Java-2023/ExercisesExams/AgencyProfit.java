package ExercisesExams;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int numAdultTicket = Integer.parseInt(scanner.nextLine());
        int numChildrenTickets = Integer.parseInt(scanner.nextLine());
        double priceForAdult = Double.parseDouble(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());


        double childrenTickets = priceForAdult - priceForAdult * 0.70;
        childrenTickets += tax;
        priceForAdult += tax;
        double totalTicketsPrice = (childrenTickets * numChildrenTickets) + (priceForAdult * numAdultTicket);
        double profit = totalTicketsPrice * 0.20;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, profit);
    }


}

