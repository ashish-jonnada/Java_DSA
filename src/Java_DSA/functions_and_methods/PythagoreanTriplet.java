package Java_DSA.functions_and_methods.assignments;
import java.util.Scanner;
public class PythagoreanTriplet {
    static boolean isPythagoreanTriplet(int a,int b,int c){
        int max=c;
        if(a>max) max=a;
        if(b>max) max=b;
        if(max==a) return a*a==(b*b)+(c*c);
        if(max==b) return b*b==(a*a)+(c*c);
        if(max==c) return c*c==(a*a)+(b*b);
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter triplet numbers a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a<0||b<0||c<0){
            System.out.println("given numbers are negative");
            return;
        }
        System.out.println("is given numbers are pythagorean triplets : "+isPythagoreanTriplet(a,b,c));

    }
}
