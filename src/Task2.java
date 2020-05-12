import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int [] firstCorner = {4,10};
        int [] secondCorner = {16,4};

        int [] testPoint = {8,6};

        if (isInArea(firstCorner,secondCorner,testPoint)){
            System.out.println("This point is in defined area");
        }
        else
            System.out.println("This point is not in defined area");

    }

    static boolean isInArea (int [] firstCoordinates, int [] secondCoordinates, int [] pointCoordinates){
        return ((pointCoordinates[0] >= firstCoordinates[0]) && (pointCoordinates[0] <= secondCoordinates[0])) && ((pointCoordinates[1] <= firstCoordinates[1]) && (pointCoordinates[1] >= secondCoordinates[1]));
    }
}
