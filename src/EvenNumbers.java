import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input! Please, try again");
            scanner.next();
        }
        int x1 = scanner.nextInt();
        if (x1%2==0){
            System.out.printf("Number %d is even",x1);
        }
        else {
            System.out.printf("Number %d is odd",x1);
        }
    }
}
