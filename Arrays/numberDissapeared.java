import java.util.*;

public class numberDissapeared {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int val : nums) {
            seen.add(val);
        }

        List<Integer> missing = new ArrayList<>();
        for (int x = 1; x <= nums.length; x++) {
            if (!seen.contains(x)) {
                missing.add(x);
            }
        }
        return missing;
    }

    public static void main(String[] args) {
        numberDissapeared nd = new numberDissapeared();
        int[] nums = {4,3,2,7,8,2,3,1}; // sample from LeetCode
        List<Integer> res = nd.findDisappearedNumbers(nums);
        System.out.println(res); // should print [5, 6]
    }
}
