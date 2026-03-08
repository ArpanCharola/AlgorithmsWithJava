public class InsertionSort {

    public void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // The element we are currently positioning
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // A simple method to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] data = {12, 11, 13, 5, 6};
        
        InsertionSort is = new InsertionSort();
        is.sort(data);

        System.out.println("Sorted array:");
        printArray(data);
    }
}