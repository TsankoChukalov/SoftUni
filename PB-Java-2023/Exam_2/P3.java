package Exam_2;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String team = scanner.nextLine();
        String souvenirType = scanner.nextLine();
        int souvenir = Integer.parseInt(scanner.nextLine());
        double souvenirPrice = 0;
        boolean isFalse = false;
        boolean invalidStock = false;

        switch (team) {
            case "Argentina":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = souvenir * 3.25;
                        break;
                    case "caps":
                        souvenirPrice = souvenir * 7.20;
                        break;
                    case "posters":
                        souvenirPrice = souvenir * 5.10;
                        break;
                    case "stickers":
                        souvenirPrice = souvenir * 1.25;
                        break;
                    default:
                        invalidStock = true;
                }
                break;
            case "Brazil":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = souvenir * 4.20;
                        break;
                    case "caps":
                        souvenirPrice = souvenir * 8.50;
                        break;
                    case "posters":
                        souvenirPrice = souvenir * 5.35;
                        break;
                    case "stickers":
                        souvenirPrice = souvenir * 1.20;
                        break;
                    default:
                        invalidStock = true;
                }
                break;
            case "Croatia":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = souvenir * 2.75;
                        break;
                    case "caps":
                        souvenirPrice = souvenir * 6.90;
                        break;
                    case "posters":
                        souvenirPrice = souvenir * 4.95;
                        break;
                    case "stickers":
                        souvenirPrice = souvenir * 1.10;
                        break;
                    default:
                        invalidStock = true;
                }
                break;
            case "Denmark":
                switch (souvenirType) {
                    case "flags":
                        souvenirPrice = souvenir * 3.10;
                        break;
                    case "caps":
                        souvenirPrice = souvenir * 6.50;
                        break;
                    case "posters":
                        souvenirPrice = souvenir * 4.80;
                        break;
                    case "stickers":
                        souvenirPrice = souvenir * 0.90;
                        break;
                    default:
                        invalidStock = true;

                }
                break;
            default:

                isFalse = true;
                break;
        }
        if (isFalse) {
            System.out.println("Invalid country!");
        } else if (invalidStock) {
            System.out.println("Invalid stock!");
        } else {
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenir, souvenirType, team, souvenirPrice);

        }

    }
}
