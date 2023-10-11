package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          int dogPacks =Integer.parseInt(scanner.nextLine());
          int catPacks =Integer.parseInt(scanner.nextLine());

           double dogMoney = dogPacks * 2.5;
           double catMoney = catPacks * 4;

             double finalPrice = dogMoney + catMoney;
                  System.out.println(finalPrice);
    }
}
