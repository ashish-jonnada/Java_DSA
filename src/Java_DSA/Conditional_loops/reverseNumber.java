package Java_DSA.Conditional_loops;

public class reverseNumber {
    static void main(String[] args) {
        int num=5689;
        int temp,rev=0,rem;
        while(num>0){
            rem=num%10;
            num=num/10;
            rev=(rev*10)+rem;
        }
        System.out.println(rev);
    }
}
