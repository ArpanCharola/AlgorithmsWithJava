package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int partner = target - nums[i];
            if(map.containsKey(partner)){
                return new int[] { map.get(partner),i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum2 twoSum2 = new TwoSum2();
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum2.twoSum(nums, target);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}
