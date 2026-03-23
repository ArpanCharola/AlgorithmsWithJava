//binarySearch
package Hackerearth;
import java.util.*;

class paintersPartition {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        long l = sc.nextLong();
        long r = sc.nextLong();
        
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long MOD = 1000000007;
        long[] pref = new long[n + 1];
        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] + a[i];
        }

        long[] dp = new long[n + 1];
        long[] dpPref = new long[n + 2];
        
        dp[0] = 1;
        dpPref[1] = 1;

        int left = 0;
        int right = 0;

        for (int i = 1; i <= n; i++) {
            while (right < i && pref[i] - pref[right] > r) {
                right++;
            }
            while (left < i && pref[i] - pref[left] >= l) {
                left++;
            }

            if (right < left) {
                long sum = (dpPref[left] - dpPref[right] + MOD) % MOD;
                dp[i] = sum;
            }
            
            dpPref[i + 1] = (dpPref[i] + dp[i]) % MOD;
        }

        System.out.println(dp[n]);
    }
}