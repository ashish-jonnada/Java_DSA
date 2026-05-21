package Java_DSA.Conditional_loops;

import java.util.Scanner;

public class AverageNnumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        float average=(float) sum/n;
        System.out.println(average);

    }
}
