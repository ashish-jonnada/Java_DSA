package Java_DSA.functions_and_methods;

public class isArmstrong {
    static boolean isArmstrong(int n){
        int original,rem,sum=0;
        original=n;
        while(n>0){
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;
        }
        return original==sum;
    }

    static void main() {
        for (int i=100;i<1000;i++){
            if (isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
}
