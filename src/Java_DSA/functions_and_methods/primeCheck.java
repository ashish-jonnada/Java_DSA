/*
Question: Define a method to find out if a number is prime or not.
*/

package Java_DSA.functions_and_methods;
import java.util.Scanner;
public class primeCheck {
    static boolean isprime(int n){
        if (n==1){
            System.out.println("neither prime nor composite");
            return false;
        }
        int c=2;
        while(c<=Math.sqrt(n)){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int n;
            System.out.println("enter a number to check prime");
            n = sc.nextInt();
            if(n==0){
                break;
            }
            boolean ans = isprime(n);
            System.out.println(ans);
        }
    }
}
