package Leetcode.Quests.Math;

public class pivotInt {
    public int pivotInteger(int n) {

        int total = n * (n + 1) / 2; 
        int sq = (int)Math.sqrt(total);

        if (sq * sq == total) return sq;

        return -1;
    }
    public static void main(String[] args) {
        int num = 8;
        pivotInt pi = new pivotInt();
        int ans = pi.pivotInteger(num);
        System.out.println(ans);
    }
}