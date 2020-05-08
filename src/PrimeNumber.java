import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Please enter the number");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            System.out.println("Wrong input! Please, try again");
            scanner.next();
        }
        int x1 = scanner.nextInt();
        int b=0;
        for (int i = 2; i<x1; i++){
            if (x1%i==0){
                b++;
            }

        }
        if (b!=0)
        System.out.printf("%d is not a prime number",x1);
        else
            System.out.printf("%d is a prime number",x1);
    }
}
