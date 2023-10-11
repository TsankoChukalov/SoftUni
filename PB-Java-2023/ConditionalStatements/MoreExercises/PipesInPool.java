package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double totalLitersP1 = p1 * h;
        double totalLitersP2 = p2 * h;
        double totalLiters = totalLitersP1 + totalLitersP2;

        double p1Percents = (totalLitersP1 / totalLiters) * 100;
        double p2Percents = (totalLitersP2 / totalLiters) * 100;
        double totalLitersPercents = (totalLiters / v) * 100;

        double overFlows = Math.abs(totalLiters - v);
        String percent = "%";

        if (v >= totalLiters) {
            System.out.printf("The pool is %.2f%s full. Pipe 1: %.2f%s. Pipe 2: %.2f%s.", totalLitersPercents, percent, p1Percents, percent, p2Percents, percent);
        } else {
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", h, overFlows);
        }


    }
}
