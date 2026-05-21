package com.assignments;

import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the four co ordinates");
        int x1=sc.nextInt();
        int y1= sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        double num1= Math.pow((x2-x1),2);
        double num2= Math.pow((y2-y1),2);

        double num=num1+num2;
        double dist=Math.sqrt(num);
        System.out.println("distance Between points is "+dist);
    }
}
