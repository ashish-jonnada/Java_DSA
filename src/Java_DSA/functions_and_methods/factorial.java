/*
Question: Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
*/

package Java_DSA.functions_and_methods;
import java.util.Scanner;
public class factorial {
    static long factorial(int n){
        long fact=1;
        for(int i=2;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        if(n<0){
            System.out.println("negative number");
            return;
        }
        System.out.println("factorial of a number is :"+factorial(n));
        sc.close();
    }
}
