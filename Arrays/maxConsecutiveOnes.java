// Q3. Max Consecutive Ones
public class maxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;  // current streak of 1s
        int max = 0;      // best streak seen so far

        for (int num : nums) {
            if(num == 1){
                current++;
            }
            else{
                max = Math.max(max, current);
                current = 0;
            }
        }
        max = Math.max(max, current);
        return max;
    }
    public static void main(String[] args) {
        int binArray[] = {1, 1, 0, 1, 1, 1, 1};
        maxConsecutiveOnes m = new maxConsecutiveOnes();
        int res = m.findMaxConsecutiveOnes(binArray);
        System.out.print(res);
    }
}