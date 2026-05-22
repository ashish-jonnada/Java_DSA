package Java_DSA.Arrays;

import java.util.Scanner;

public class findMax {
    static int max(int[] array){
        int max=array[0];
        for(int num:array){
            if(num>max) max=num;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("max "+max(arr));
    }
}
