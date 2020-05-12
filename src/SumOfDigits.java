import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner = new Scanner(System.in);

        int x = checkInput(scanner);

        System.out.println(sum(x));
    }

    static int sum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;

    }

    static int checkInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong input! Please, try again");
            scanner.next();
        }
        return scanner.nextInt();
    }

}
