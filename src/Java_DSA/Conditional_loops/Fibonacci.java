package Java_DSA.Conditional_loops;

import java.util.Scanner;

public class Fibonacci {
    static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter No of terms :");
        int num =sc.nextInt();
        int a=0;
        int b=1;
        int count=2;
        while(count<=num){
            int temp=b;
            b=b+a;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
