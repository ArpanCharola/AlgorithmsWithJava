//Shuffle array - https://leetcode.com/problems/shuffle-the-array/
import java.util.Arrays;

public class shufflingArray {
    public int[] shuffle(int[] nums, int n) {
        int ogsize = n * 2;
        int[] ans = new int[ogsize];
        for(int i = 0; i < n; i++){
                ans[2 * i] = nums[i];
                ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 4, 5, 6, 7};
        int n = 3;
        shufflingArray s = new shufflingArray();
        int res[] = s.shuffle(nums, n);
        System.out.println(Arrays.toString(res));
    }
}