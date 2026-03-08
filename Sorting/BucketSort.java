import java.util.*;

public class BucketSort {
    public static void sort(float[] arr) {
        int n = arr.length;
        if (n <= 0) return;

        // 1. Create buckets
        List<Float>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) buckets[i] = new ArrayList<>();

        // 2. Add elements into buckets
        for (float val : arr) {
            int bucketIdx = (int) (val * n); 
            buckets[bucketIdx].add(val);
        }

        // 3. Sort individual buckets and merge
        int index = 0;
        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
            for (float val : bucket) {
                arr[index++] = val;
            }
        }
    }
    public static void main(String[] args) {
        float[] data = {0.42f, 0.32f, 0.23f, 0.52f, 0.25f, 0.47f, 0.51f};
        sort(data);
        for (float num : data) {
            System.out.print(num + " ");
        }
    }
}