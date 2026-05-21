package Java_DSA.Conditional_loops;

import java.util.Scanner;

public class DicountAmount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float DiscAmount,SellingPrice;
        System.out.print("Enter the amount of the product:");
        float amount=sc.nextFloat();
        System.out.print("enter the discount percentage:");
        int disc=sc.nextInt();
        if (amount<=0||disc<0||disc>100){
            System.out.println("invalid");
        }else {
            DiscAmount = (amount * disc) / 100;
            System.out.println("Discount amount : " + DiscAmount);
            SellingPrice = amount - DiscAmount;
            System.out.println("Final Price : " + SellingPrice);
        }
    }
}
