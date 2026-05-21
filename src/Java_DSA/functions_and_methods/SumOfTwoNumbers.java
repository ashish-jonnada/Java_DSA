/*
Question: Write a program to print the sum of two numbers entered by user by defining your own method.
*/

package Java_DSA.functions_and_methods;
import java.util.Scanner;
public class SumOfTwoNumbers {
    static void sum(){
        int num1,num2,add;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num1");
        num1=sc.nextInt();
        System.out.println("enter num2:");
        num2=sc.nextInt();
        add=num1+num2;
        System.out.println(add);

    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sum();

    }
}
