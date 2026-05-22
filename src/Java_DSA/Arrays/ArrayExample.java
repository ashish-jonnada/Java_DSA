package Java_DSA.Arrays;

import java.util.*;

public class ArrayExample {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        // Array creation
        int[] array=new int[5];

        // Taking input for array
        for (int i=0;i<array.length;i++) {
            System.out.print("Enter a number: ");
            array[i]=sc.nextInt();
        }

        // Printing using normal for loop
        for(int j=0;j<array.length; j++) {
            System.out.print(array[j] + " ");
        }

        System.out.println();

        // Printing using enhanced for loop
        for(int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Printing using Arrays.toString()
        System.out.println(Arrays.toString(array));

        // Modifying array using function
        changeArray(array);

        // Printing modified array
        System.out.println(Arrays.toString(array));
    }

    // Function used to modify array
    static void changeArray(int[] num) {
        num[1] = 1000;
    }
}