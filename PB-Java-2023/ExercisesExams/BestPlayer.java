package ExercisesExams;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();

        String players = " ";
        int goal = 0;
        int bestPlayersGoals = Integer.MIN_VALUE;
        while (!playerName.equals("END")) {
            int numOfGoals = Integer.parseInt(scanner.nextLine());
            if (bestPlayersGoals < numOfGoals) {
                bestPlayersGoals = numOfGoals;
                players = playerName;
            }
            if (bestPlayersGoals >= 10) {
                break;
            }


            playerName = scanner.nextLine();
        }
        System.out.printf("%s is the best player!\n", players);
        if (bestPlayersGoals >= 3) {
            System.out.printf("He has scored %d goals and made a hat-trick !!!", bestPlayersGoals);
        } else {
            System.out.printf("He has scored %d goals.", bestPlayersGoals);
        }

    }
}
