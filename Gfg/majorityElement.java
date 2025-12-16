// Majority Element - https://www.geeksforgeeks.org/problems/majority-element-1587115620/1?page=1&category=Arrays,Strings&company=Amazon,Microsoft,Google,Flipkart&sortBy=submissions
package Gfg;
import java.util.*;
class majorityElement{
    int findMajorityElement(int arr[]) {
        List<Integer> l = new ArrayList<>();
        for(int nums: arr){
            l.add(nums);
        }
        Collections.sort(l);
        int candidate = l.get(l.size()/2);
        int count = 0;
        for(int num : l) {
            if(num == candidate) count++;
        }
        return (count > l.size()/2) ? candidate : -1;
    }
    public static void main(String[] args) {
        majorityElement me = new majorityElement();
        int nums[] = {1, 2, 1, 2, 1, 1, 3, 1, 2, 1};
        int res = me.findMajorityElement(nums);
        System.out.println(res);
    }
}