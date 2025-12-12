class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[37]; 

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i);
            count[sum]++;
        }

        int max = 0;
        for (int c : count) {
            if (c > max) max = c;
        }

        int ans = 0;
        for (int c : count) {
            if (c == max) ans++;
        }

        return ans;
    }

    private int digitSum(int num) {
        int s = 0;
        while (num > 0) {
            s += num % 10;
            num /= 10;
        }
        return s;
    }
}
