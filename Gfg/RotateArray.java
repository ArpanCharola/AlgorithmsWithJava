package Gfg;

public class RotateArray {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d = d % n;
        
        int[] temp = new int[n];
    
        for(int i = 0; i < d; i++) {
        temp[n - d + i] = arr[i];
        }
        
        for(int i = d; i < n; i++) {
            temp[i - d] = arr[i];
        }
        
        for(int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;
        //RotateArray ra = new RotateArray();
        RotateArray.rotateArr(arr, d);
    }
} 