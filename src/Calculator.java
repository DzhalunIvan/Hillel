import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double x1;
        double x2;
        double sum;
        double diff;
        double multp;
        double div;
        System.out.println("Please input first number");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input! Please, try again");
            scanner.next();
        }
        x1 = scanner.nextDouble();
        System.out.println("Please input second number");
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input! Please, try again");
            scanner.next();
        }
        x2 = scanner.nextDouble();
        System.out.printf("You entered %f as a first number and %f as a second number.\n ", x1, x2);
        System.out.println("Please, choose math operation: /, *,+,-");

        while (!(scanner.hasNext("\\*") || scanner.hasNext("/") || scanner.hasNext("-") || scanner.hasNext("\\+"))) {
            System.out.println("Wrong input! Try again.");
            scanner.next();
        }
        String operand = scanner.next();
        switch (operand) {
            case "+": {
                sum = x1 + x2;
                System.out.printf("%f %s %f = %f\n", x1, operand, x2, sum);
                break;
            }
            case "-": {
                diff = x1 - x2;
                System.out.printf("%f %s %f = %f\n", x1, operand, x2, diff);
                break;
            }
            case "*": {
                multp = x1 * x2;
                System.out.printf("%f %s %f = %f\n", x1, operand, x2, multp);
                break;
            }
            case "/": {
                if (x2 == 0) {
                    System.out.println("Division by zero is undefined");
                    break;
                }
                div = x1 / x2;
                System.out.printf("%f %s %f = %f\n", x1, operand, x2, div);
                break;
            }
            default: {
                System.out.println("You need to enter +, -, *, /!");
            }
        }
    }
}
