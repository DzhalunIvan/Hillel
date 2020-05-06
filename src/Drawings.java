import java.util.Scanner;

public class Drawings {
    public static void main(String[] args) {
        System.out.println("What would you like to draw: a) a square; b) an envelope; c)a chessboard?\nEnter a, b or c");
        Scanner scanner = new Scanner(System.in);
        while (!(scanner.hasNext("a")||scanner.hasNext("b")||scanner.hasNext("c"))) {
            System.out.println("Wrong input! Please, try again");
            scanner.next();
        }
        String operator = scanner.next();

        switch (operator) {

            case "a": {
                System.out.println("Enter the width of a figure:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input! Please, try again");
                    scanner.next();
                }
                int m = scanner.nextInt();
                System.out.println("Enter the height of a figure:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input! Please, try again");
                    scanner.next();
                }
                int n = scanner.nextInt();
                Square square = new Square(m, n);
                square.draw();
                break;
            }
            case "b":{
                System.out.println("Enter the width of a figure:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input! Please, try again");
                    scanner.next();
                }
                int m = scanner.nextInt();
                System.out.println("Enter the height of a figure:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input! Please, try again");
                    scanner.next();
                }
                int n = scanner.nextInt();
            Envelope envelope = new Envelope(m, n);
            envelope.draw();
            break;
            }
            case "c": {
                System.out.println("Enter the width of a figure:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input! Please, try again");
                    scanner.next();
                }
                int m = scanner.nextInt();
                System.out.println("Enter the height of a figure:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Wrong input! Please, try again");
                    scanner.next();
                }
                int n = scanner.nextInt();
                Chessboard chessboard = new Chessboard(m, n);
                chessboard.draw();
                break;
            }
        }
    }

    static class Square {
        int m;
        int n;

        public Square(int x, int y) {
            m = x;
            n = y;
        }

        public void draw() {
            for (
                    int i = 0;
                    i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == 0 || i == m - 1))
                        System.out.print("*");
                    else if ((i != 0 || i != m - 1) && (j == 0 || j == n - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }


    static class Envelope {
        int m;
        int n;

        public Envelope(int x, int y) {
            m = x;
            n = y;
        }

        public void draw() {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i == 0 || i == m - 1))
                        System.out.print("*");
                    else if ((i != 0 || i != m - 1) && (j == 0 || j == n - 1)) {
                        System.out.print("*");
                    } else if ((i == j) || (i == n - j - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    static class Chessboard {
        int m;
        int n;

        public Chessboard(int x, int y) {
            m = x;
            n = y;
        }

        public void draw() {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i % 2 == 0) && (j % 2 == 0)) {
                        System.out.print("*");
                    } else if ((i % 2 != 0) && (j % 2 != 0)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
