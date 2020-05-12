import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        System.out.println("Enter amount of money you want to put on your deposit account");
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextDouble()){
            System.out.println("Wrong input! Please, try again.");
            scanner.next();
        }
        double depositMoney = scanner.nextDouble();
        System.out.println("Enter the deposit term (years):");
        if (!scanner.hasNextInt()){
            System.out.println("Wrong input! Please, try again.");
            scanner.next();
        }
        int depositTerm = scanner.nextInt();
        System.out.println("Enter the annual percentage:");
        while (!scanner.hasNextDouble()){
            System.out.println("Wrong input! Please, try again.");
        }
        double depositPercentage = scanner.nextDouble();
        double income;
        for (int i = 1; i <= depositTerm; i++){
            income = depositMoney * depositPercentage/100;
            depositMoney +=income;
            System.out.printf("After %d year you'll earn %.2f. You'll have %.2f on your bank account\n",i,income,depositMoney);
        }
    }
}
