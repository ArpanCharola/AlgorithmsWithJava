package Hackerrank;
import java.util.*;

class Result {

    public static long countInversions(List<Integer> arr) {
        int[] array = arr.stream().mapToInt(i -> i).toArray();
        int[] temp = new int[array.length];
        return mergeSortAndCount(array, temp, 0, array.length - 1);
    }

    private static long mergeSortAndCount(int[] arr, int[] temp, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSortAndCount(arr, temp, left, mid);
            count += mergeSortAndCount(arr, temp, mid + 1, right);

            count += mergeAndCount(arr, temp, left, mid, right);
        }
        return count;
    }

    private static long mergeAndCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;    
        int j = mid + 1; 
        int k = left;    
        long count = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                count += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= right) {
            temp[k++] = arr[j++];
        }
        
        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }

        return count;
    }
}

class msCountingInversion {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 20, 6, 4, 5);
        long result = Result.countInversions(arr);
        System.out.println(result); // Output: 5
    }
}