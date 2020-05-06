import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        double x1;
        double x2;
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input! You should enter the number! Please, try again.");
            scanner.next();
        }
        x1 = scanner.nextDouble();
        System.out.println("Enter the second number");
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input! You should enter the number! Please, try again.");
            scanner.next();
        }
        x2 = scanner.nextDouble();
        average = (x1 + x2) / 2;
        System.out.printf("You entered %f as the first number and %f as a second number.\nAverage for your numbers is %f", x1, x2, average);
    }
}
