// 2544 Alternating Digit - https://leetcode.com/problems/alternating-digit-sum/

import java.util.*;

class AlternatingDigit {
    public int alternateDigitSum(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }

        int sum = 0;
        int c = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            int d = list.get(i);
            if (c % 2 == 0) sum += d;
            else sum -= d;
            c++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 701;
        AlternatingDigit ad = new AlternatingDigit();
        int ans = ad.alternateDigitSum(num);
        System.out.println(ans);
    }
}