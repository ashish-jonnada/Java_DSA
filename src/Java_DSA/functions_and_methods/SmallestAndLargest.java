/*
Question: Define two methods to print the maximum and the minimum number respectively among
        three numbers entered by the user.
*/

package Java_DSA.functions_and_methods;
import java.util.Scanner;
public class SmallestAndLargest {
    static int largest(int a,int b,int c){
        int large=a;
        if(b>a) large=b;
        if(c>a) large = c;
        return large;
    }
    static int smallest(int a,int b,int c){
        int small=a;
        if(b<small) small=b;
        if(c<small) small=c;
        return small;
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr 3 numbers");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest=largest(a,b,c);
        System.out.println("largest: "+largest);
        int smallest=smallest(a,b,c);
        System.out.println("Smallest: "+smallest);
    }
}
