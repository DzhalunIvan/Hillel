public class Fibonacci {

    static long fibRecoursive(int i) {
        if (i <= 1) {
            return i;
        } else return fibRecoursive(i - 1) + fibRecoursive(i - 2);
    }

    static long fibCycle(int i) {
        long firstFib = 0;
        long secondFib = 1;
        long fib =0;
        if (i <= 1)
            return i;
        for (int j = 1; j < i; j++) {
            fib = firstFib + secondFib;
            firstFib = secondFib;
            secondFib = fib;

        }
        return fib;
    }

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(fibRecoursive(42));
        System.out.println((System.currentTimeMillis()-time));
        long time1 = System.currentTimeMillis();
        System.out.println(fibCycle(92));
        System.out.println((System.currentTimeMillis()-time1));
    }
}
