/*
Given an integer array nums of length n, you want to create an array ans of length 2n
where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
Specifically, ans is the concatenation of two nums arrays.
Return the array ans

Example 1:
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
Example 2:
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]

Constraints:
n == nums.length
1 <= n <= 1000
1 <= nums[i] <= 1000
 */
package Java_DSA.Arrays;

import java.util.*;

public class ArrayConcatenation_LeetCode1929 {
    static int[] solution(int[] nums){
        int[] ans = new int[2* nums.length];
        int n= nums.length;
        for(int i = 0; i< nums.length; i++){
            ans[i]=ans[i+n]= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] array=new int[3];
        for (int i=0;i<array.length;i++) {
            System.out.print("Enter a number: ");
            array[i]=sc.nextInt();
        }


        System.out.println(Arrays.toString(solution(array)));
    }
}
