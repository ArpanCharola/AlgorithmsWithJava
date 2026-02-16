// Leetcode - Concatenate Array - https://leetcode.com/problems/concatenation-of-array/description/
import java.util.Arrays;

public class concatenateArray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i = 0; i < 2 * n; i++){
            ans[i] = nums[i % n];
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        concatenateArray c = new concatenateArray();
        int[] res = c.getConcatenation(nums);
        System.out.println(Arrays.toString(res));
    }
}