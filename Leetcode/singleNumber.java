//package Leetcode;
import java.util.HashSet;
import java.util.Set;
public class singleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(!s.contains(val)){
                s.add(val);
            } else {
                s.remove(val);
            }
        }
        int ans = s.iterator().next();
        return ans;
    }
}
