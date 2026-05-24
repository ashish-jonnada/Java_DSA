/*
1512. Number of Good Pairs
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */
package Java_DSA.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Goodpairs_leetcode {
    static int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]&&i<j){
                    count+=1;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[4];
        for (int i=0;i<array.length;i++) {
            System.out.print("Enter a number: ");
            array[i]=sc.nextInt();
        }


        System.out.println(numIdenticalPairs(array));
    }
}
