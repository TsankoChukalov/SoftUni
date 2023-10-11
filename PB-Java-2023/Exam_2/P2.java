package Exam_2;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double averageHeightOfAstronauts = Double.parseDouble(scanner.nextLine());

        double volume = width * length * height;
        double volumeRoom = (averageHeightOfAstronauts + 0.40) * 2 * 2;
        double placeFor = Math.floor(volume / volumeRoom);

        if (placeFor < 3) {
            System.out.println("The spacecraft is too small.");
        } else if (placeFor <= 10) {
            System.out.printf("The spacecraft holds %.0f astronauts.", placeFor);
        } else {
            System.out.println("The spacecraft is too big.");
        }

    }
}
