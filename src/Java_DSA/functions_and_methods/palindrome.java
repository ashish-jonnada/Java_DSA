package Java_DSA.functions_and_methods.assignments;

import java.util.Scanner;

public class palindrome {
    static boolean isPalindrome(long n){
        long original=n,rev=0,rem;
        if(n<0) return false;
        while(n>0){
            rem= n % 10;
            rev=(rev*10)+rem;
            n=n/10;
        }
        return original==rev;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number to check palindrome");
        long n=sc.nextLong();
        if(isPalindrome(n)) System.out.println("Thne number is palindrome");
        else System.out.println("the number is not palindrome");
        sc.close();
    }
}
