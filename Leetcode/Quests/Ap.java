package Quests;

import java.util.Arrays;

class Ap{
    boolean isArithmeticProgression(int arr[]){
        Arrays.sort(arr);
        int diff = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i - 1] == diff){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        Ap ap = new Ap();
        boolean ans = ap.isArithmeticProgression(arr);
        System.out.println(ans);
    }
}