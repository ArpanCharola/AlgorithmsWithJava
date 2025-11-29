import java.util.*;

class setMismatch {
    public int[] findErrorNums(int[] nums) {
        int repeated = -1;
        int missing = -1;
        int n = nums.length;
        Set<Integer> s = new HashSet<>();

        for (int val : nums) {
            if (!s.contains(val)) {
                s.add(val);
            } else {
                repeated = val;
            }
        }

        for (int x = 1; x <= n; x++) {
            if (!s.contains(x)) {
                missing = x;
                break;
            }
        }
        return new int[]{repeated, missing};
    }

    public static void main(String[] args) {
        setMismatch sm = new setMismatch();
        int[] nums = {1, 2, 2, 4}; // example input
        int[] res = sm.findErrorNums(nums);
        System.out.println("Repeated: " + res[0] + ", Missing: " + res[1]);
    }
}
