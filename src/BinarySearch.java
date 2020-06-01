import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] mas = new int[10000];
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(20000);
        }
        Arrays.sort(mas);
        System.out.println(Arrays.toString(mas));
        System.out.println(binarySearch(mas, 21));

    }

    public static boolean binarySearch(int[] mas, int n) {
        int left = 0;
        int right = mas.length - 1;

        int index = 0;
        while (left <= right) {
            int center = (right + left) / 2;
            if (n == mas[center])
                return true;
            else if (n < mas[center]) {
                right = center - 1;
            } else if (n > mas[center]) {
                left = center + 1;
            }


        }
        return false;
    }
}
