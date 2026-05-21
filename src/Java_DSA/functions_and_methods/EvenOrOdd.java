/*
Question: Define a program to find out whether a given number is even or odd.
*/

package Java_DSA.functions_and_methods;
import java.util.Scanner;
public class EvenOrOdd {
    static void EvenOrOdd(int n){
        if(n%2==0) System.out.println("Even");
        else System.out.println("odd");
    }
    static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
       int n= sc.nextInt();
       EvenOrOdd(n);

    }
}
