public class RadixSort {
    // Helper: A modified Counting Sort to sort based on a specific digit (exp)
    private static void countingSortByDigit(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // Digits 0-9

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        System.arraycopy(output, 0, arr, 0, n);
    }

    public static void sort(int[] arr) {
        // Find the maximum number to know number of digits
        int max = arr[0];
        for (int i : arr) if (i > max) max = i;

        // Do counting sort for every digit. 
        // exp is 10^i where i is current digit number
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSortByDigit(arr, exp);
        }
    }
    public static void main(String[] args) {
        int[] data = {170, 45, 75, 90, 802, 24, 2, 66};
        sort(data);
        System.out.println("Sorted array:");
        for (int num : data) System.out.print(num + " ");
    }
}