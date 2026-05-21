/*
Question: A person is eligible to vote if his/her age is greater than or equal to 18.
            Define a method to find out if he/she is eligible to vote.
*/
package Java_DSA.functions_and_methods;
import java.util.Scanner;
public class VoteEligibility {
    static boolean isEligible(int n){
        return n >= 18;
    }

    public static void main(String[] args) {
        int age;
        Scanner sc =new Scanner(System.in);
        age=sc.nextInt();
        if(isEligible(age)) System.out.println("he/She is eligible to vote");
        else System.out.println("not eligible");
    }
}
