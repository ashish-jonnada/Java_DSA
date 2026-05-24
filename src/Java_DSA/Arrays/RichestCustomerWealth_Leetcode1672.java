/*
1672. Richest Customer Wealth



Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
Example 2:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
Example 3:
Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
Output: 17
Constraints:
m == accounts.length
n == accounts[i].length
1 <= m, n <= 50
1 <= accounts[i][j] <= 100
 */
package Java_DSA.Arrays;

import java.util.Scanner;

public class RichestCustomerWealth_Leetcode1672 {
    static int maximumWealth(int[][] array){
        int maxWealth=0,sum,m=array.length,n;
        for (int i=0;i<m;i++){
            n=array[i].length;
            sum=0;
            for(int j=0;j<n;j++){
                sum=array[i][j]+sum;
            }
            if (sum>=maxWealth){
                maxWealth=sum;
            }
        }
        return maxWealth;
    }
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] array = new int[2][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(maximumWealth(array));
    }
}
