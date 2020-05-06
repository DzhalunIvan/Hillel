

import java.util.Scanner;

public class AverageForSomeNumbers {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("For how many numbers you want to calculate the average meaning? Please, enter the number");
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong input! You should enter the number! Try again");
            scanner.next();
        }
        n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter your " + i + " number:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Wrong input! You should enter the number! Try again");
                scanner.next();
            }
            sum += scanner.nextDouble();
        }
        double average = sum / n;
        System.out.printf("You entered %d numbers. Average for your numbers is %f", n, average);
    }
}
