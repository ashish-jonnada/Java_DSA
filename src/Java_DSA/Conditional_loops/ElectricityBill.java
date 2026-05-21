package Java_DSA.Conditional_loops;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No of units consumed:");
        float units=sc.nextFloat();
        float bill;
        float temp;
        if(units>0 && units<=100){
            bill= (float) (units*3.5);
            System.out.println(bill);
        } else if (units>100 &&units<=200) {
            bill=(float) (units*3.5)+((units-100)*5);
            System.out.println(bill);
        }
        else {
            bill=(float)((100*3.5)+(100*5));
            units=units-200;
            temp=units*7;
            bill=bill+temp;
            System.out.println(bill);
        }
    }
}
