package Java_DSA.Arrays;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the ArrayList: ");
        int n =sc.nextInt();
        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);

        System.out.print("enter the no of element that you want :");
        n=sc.nextInt();
        System.out.println(list.get(n));
    }
}
