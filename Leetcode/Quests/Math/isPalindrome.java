package Leetcode.Quests.Math;

public class isPalindrome {
    public boolean isPalindrome(int x) {
        int num = x;
        int dig = 0;
        int sum = 0;
        while(x > 0){
            dig = x % 10; 
            x = x/10;
            sum = sum * 10 + dig;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 121;
        isPalindrome p = new isPalindrome();
        boolean ans = p.isPalindrome(num);
        System.out.println(ans);
    }
}