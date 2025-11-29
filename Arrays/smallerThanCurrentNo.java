import java.util.*;

public class smallerThanCurrentNo {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        smallerThanCurrentNo s = new smallerThanCurrentNo();
        int[] nums = {8, 1, 2, 2, 3};
        int[] res = s.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(res));
    }
}