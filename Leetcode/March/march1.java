// 1689. Partitioning Into Minimum Number Of Deci-Binary Numbers (leetcode)
// A decimal number is called deci-binary if each of its digits is either 0 or 1 without any leading zeros. 
// For example, 101 and 1100 are deci-binary, while 112 and 3001 are not deci-binary.

package March;

public class march1 {
    public int minPartitions(String n) {
        int ans = 0;

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';
            ans = Math.max(ans, digit);
            if (ans == 9) return ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        march1 m = new march1();
        System.out.println(m.minPartitions("32"));
    }
}