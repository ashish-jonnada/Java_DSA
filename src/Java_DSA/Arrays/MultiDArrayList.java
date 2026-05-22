package Java_DSA.Arrays;
import java.util.*;
public class MultiDArrayList {
    public static void main(String[] args) {

        // 2D ArrayList creation
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no of rows :");
        int n = sc.nextInt();
        System.out.print("enter the no of columns :");
        int m=sc.nextInt();

        // Creating rows (inner ArrayLists)
        for (int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }

        // Taking input for each row and column
        for (int i =0;i<n;i++){
            for(int j=0;j<m;j++){
                list.get(i).add(sc.nextInt());
            }
        }

        System.out.println(list);

        sc.close();
    }
}
