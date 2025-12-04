// 744. Smallest Letter greater than target - https://leetcode.com/problems/find-smallest-letter-greater-than-target/
package Leetcode;

class SmallestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (letters[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return letters[left % letters.length];
    }
    public static void main(String[] args) {
        char[] letter = { 'a', 'h', 'p'};
        char target = 'i';
        SmallestLetter sl = new SmallestLetter();
        char s = sl.nextGreatestLetter(letter,target);
        System.out.println(s);
    }
}