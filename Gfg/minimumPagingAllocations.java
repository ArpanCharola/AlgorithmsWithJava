package Gfg;

class Solution {
    public int findPages(int[] arr, int k) {
        int n = arr.length;
        
        if (k > n) {
            return -1;
        }

        int low = 0, high = 0;
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        int res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(arr, n, k, mid)) {
                res = mid;
                high = mid - 1; 
            } else {
                low = mid + 1; 
            }
        }
        return res;
    }

    private boolean isPossible(int[] arr, int n, int k, int maxPages) {
        int studentsRequired = 1;
        int currentPagesSum = 0;

        for (int i = 0; i < n; i++) {
            if (currentPagesSum + arr[i] > maxPages) {
                studentsRequired++;
                currentPagesSum = arr[i];
                
                if (studentsRequired > k) {
                    return false;
                }
            } else {
                currentPagesSum += arr[i];
            }
        }
        return true;
    }
}

public class minimumPagingAllocations {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        System.out.println(sol.findPages(arr, k)); 
    }
}