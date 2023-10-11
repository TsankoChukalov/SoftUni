package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int length =Integer.parseInt(scanner.nextLine());
        int width =Integer.parseInt(scanner.nextLine());
        int height =Integer.parseInt(scanner.nextLine());
        double percent =Double.parseDouble(scanner.nextLine());

        int capacityInCm =length * width * height;
        double capacityInL = capacityInCm * 0.001;

        double totalLiters = capacityInL - (capacityInL * percent / 100);

        System.out.println(totalLiters);

    }
}
