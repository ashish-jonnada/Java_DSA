package Java_DSA.Arrays;
import java.util.*;
public class MultiDArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 2D Array Creation

        // Method 1: Direct initialization
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Method 2: Using new keyword
        int[][] arr2D = new int[3][3];

        // Taking input for 2D array
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr2D[i][j] = sc.nextInt();
            }
        }

        // Printing elements using normal nested loops
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        // Printing using Arrays.toString()
        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }

        // Printing using enhanced for loop
        for (int[] row : arr2D) {
            System.out.println(Arrays.toString(row));
        }
    }
}