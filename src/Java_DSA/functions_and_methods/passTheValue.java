package Java_DSA.functions_and_methods;

import java.util.Scanner;

public class passTheValue {
    static int sum(int num1,int num2){
        int add=num1+num2;
        return add;
    }

    static void main(String[] args) {
        int a,b,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the valye of aand b");
        a=sc.nextInt();
        b=sc.nextInt();
        ans=sum(a,b);
        System.out.println(ans);
    }
}
