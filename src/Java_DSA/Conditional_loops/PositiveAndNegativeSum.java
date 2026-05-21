package Java_DSA.Conditional_loops;

import java.util.Scanner;

public class PositiveAndNegativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,Nsum=0,PEsum=0,POsum=0;
        while(true){
            System.out.println("Enter a number");
            n=sc.nextInt();
            if(n==0){
                break;
            } else if (n<0){
                Nsum=Nsum+n;
            } else if (n > 0 &&n % 2 == 0){
                PEsum=PEsum+n;
            }else{
                POsum=POsum+n;
            }
        }
        System.out.println("Nsum : "+Nsum+" PEsum: "+PEsum+" POsum: "+POsum);
        sc.close();
    }
}
