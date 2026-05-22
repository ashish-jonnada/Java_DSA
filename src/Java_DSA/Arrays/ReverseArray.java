package Java_DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    // Reversing an array using For Loop
    static int[] reverseFor(int[] array){
        int start = 0,temp, end =array.length;
        for(start =0; start < end /2; start++){
            int m= start +1;
            temp=array[start];
            array[start]=array[end-m];
            array[end-m]=temp;
        }
        return array;
    }
    // Reversing an array using While Loop
    static int[] reverseWhile(int[] array){
        int temp, start=0,end=array.length-1;
        while(start<end){
            temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start+=1 ;
            end-=1;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :"+Arrays.toString(arr));

        int[] copy1 = arr.clone();
        int[] copy2 = arr.clone();


        System.out.println("Reversed array with for loop is :"+ Arrays.toString(reverseFor(copy1)));

        System.out.println("Reversed array with while loop is :"+ Arrays.toString(reverseWhile(copy2)));
    }
}
