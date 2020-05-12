import java.util.Scanner;

public class MultipleNumbers {
    public static void main(String[] args) {
        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Wrong input! Try again.");
            scanner.next();
        }
        int x1 = scanner.nextInt();

        System.out.printf("Number %d can be divided by this numbers: ", x1);
        if (x1>0) {
            for (int i = 1; i <= x1; i++) {
                if (x1 % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
        else {
            for (int i = 1; i >= x1; i++) {
                if (x1 % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        }

    }
}
