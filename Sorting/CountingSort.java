public class CountingSort {
    public static void sort(int[] arr) {
        if (arr.length == 0) return;

        // 1. Find the maximum value to determine the range
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }

        // 2. Create the counting array (size max + 1)
        int[] count = new int[max + 1];

        // 3. Store the count of each element
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // 4. Update count[i] so it contains the actual position in output
        // (Cumulative count)
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }

        // 5. Build the output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }

        // 6. Copy the sorted elements back to original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    public static void main(String[] args) {
        int[] data = {4, 2, 2, 8, 3, 3, 1};
        sort(data);
        for (int i : data) System.out.print(i + " ");
    }
}