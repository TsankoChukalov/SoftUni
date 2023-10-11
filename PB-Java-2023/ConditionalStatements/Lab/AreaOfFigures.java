package ConditionalStatements.Lab;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFigure = scanner.nextLine();
        double area = 0;

        if (typeOfFigure.equals("square")){
            double a =Double.parseDouble(scanner.nextLine());
            area = a * a ;
        }else if (typeOfFigure.equals("rectangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            area = a * b;
        }else if (typeOfFigure.equals("circle")){
            double r = Double.parseDouble(scanner.nextLine());
            area = Math.PI * r * r;
        }else if (typeOfFigure.equals("triangle")){
            double a = Double.parseDouble(scanner.nextLine());
            double ha = Double.parseDouble(scanner.nextLine());
            area = a * ha / 2;
        }
           System.out.printf("%.3f", area);
    }
}
