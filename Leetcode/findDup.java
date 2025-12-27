class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int dup = 0;
        for(int i = 0; i < nums.length; i++){
            int val = nums[i];
            if(!s.contains(val)){
                s.add(val);
            } else {
                dup = nums[i];
                break;
            }
        }
        return dup;
    }
}
