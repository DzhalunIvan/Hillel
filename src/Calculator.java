import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double x1;
        double x2;
        System.out.println("Please input first number");
        Scanner scanner = new Scanner(System.in);
       if (!scanner.hasNextDouble()){
           System.out.println("Wrong input! Please, enter numbers");
           return;
       }
        x1 = scanner.nextDouble();
        System.out.println("Please input second number");
        if (!scanner.hasNextDouble()){
            System.out.println("Wrong input! Please, enter numbers");
            return;
        }
        x2 = scanner.nextDouble();
        double sum = x1+x2;
        double diff = x1-x2;
        double mult = x1*x2;
        double div = x1/x2;
        System.out.printf("Your input is %.3f and %.3f \n Sum is %.3f\n Difference %.3f\n Multiplication %.3f\n Division %.3f",x1,x2,sum, diff, mult, div);

    }
}
