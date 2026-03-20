package Strings;

class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "daabcbaabcbc";
        String part = "abc";
        System.out.println(sol.removeOccurrences(s, part)); // Output: "dab"
    }
}