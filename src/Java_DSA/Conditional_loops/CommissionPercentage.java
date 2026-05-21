package Java_DSA.Conditional_loops;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the total amount:");
        double Tamount=sc.nextDouble();
        System.out.println("Enter the Commision Amount:");
        double Camount=sc.nextDouble();
        double Cpercentage =(Camount/Tamount)*100;
        System.out.println(Cpercentage);
    }
}
