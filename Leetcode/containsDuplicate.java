//package Leetcode;
import java.util.HashSet;
import java.util.Set;
class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(!s.contains(val)){
                s.add(val);
            } else {
                return true;
            }
        }
        return false;
    }
}
