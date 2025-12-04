// 1. Two Sum (Leetcode) - https://leetcode.com/problems/two-sum/description/
package Leetcode;

import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j <n; j++){
                if(nums[i] + nums[j] == target){
                    return new int [] {i,j};
                }
            }
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int target = 5;
        TwoSum ts = new TwoSum();
        int[] ans = ts.twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}