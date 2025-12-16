package Gfg;
class ArraySorter {
    private int[] arr;
    
    public ArraySorter(int[] array) {
        this.arr = array.clone();  // Defensive copy
    }
    
    public void sort012() {
        int c0 = 0, c1 = 0, c2 = 0;
        int n = arr.length;
        
        // Count
        for(int i = 0; i < n; i++){
            if(arr[i] == 0) c0++;
            else if(arr[i] == 1) c1++;
            else c2++;
        }
        
        // Place in order
        for(int i = 0; i < c0; i++) arr[i] = 0;
        for(int i = c0; i < c0+c1; i++) arr[i] = 1;
        for(int i = c0+c1; i < n; i++) arr[i] = 2;
    }
    
    public void printSorted() {
        System.out.print("Sorted: ");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Usage
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 1, 0, 2};
        ArraySorter sorter = new ArraySorter(input);
        sorter.sort012();
        sorter.printSorted();  // Output: Sorted: 0 0 1 1 2 2 
    }
}
