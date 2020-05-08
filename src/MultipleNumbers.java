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
        int counter=0;
        System.out.printf("Number %d can be divided by this numbers: ", x1);
        for (int i = 2; i < x1; i++) {
            if (x1 % i == 0) {
                System.out.print(i + " ");
                counter++;
            }
        }
        if (counter == 0) {
            System.out.printf("Actually by none except 1 and %d. Your number is prime.", x1);
        }
    }
}
