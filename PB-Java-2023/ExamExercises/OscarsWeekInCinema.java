package ExamExercises;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        String hallType = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;

        switch (movieName) {
            case "A Star Is Born":
                switch (hallType) {
                    case "normal":
                        totalSum = numTickets * 7.5;
                        break;
                    case "luxury":
                        totalSum = numTickets * 10.50;
                        break;
                    case "ultra luxury":
                        totalSum = numTickets * 13.50;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (hallType) {
                    case "normal":
                        totalSum = numTickets * 7.35;
                        break;
                    case "luxury":
                        totalSum = numTickets * 9.45;
                        break;
                    case "ultra luxury":
                        totalSum = numTickets * 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (hallType) {
                    case "normal":
                        totalSum = numTickets * 8.15;
                        break;
                    case "luxury":
                        totalSum = numTickets * 10.25;
                        break;
                    case "ultra luxury":
                        totalSum = numTickets * 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (hallType) {
                    case "normal":
                        totalSum = numTickets * 8.75;
                        break;
                    case "luxury":
                        totalSum = numTickets * 11.55;
                        break;
                    case "ultra luxury":
                        totalSum = numTickets * 13.95;
                        break;
                }
                break;
        }
        System.out.printf("%s -> %.2f lv.", movieName, totalSum);

    }
}
