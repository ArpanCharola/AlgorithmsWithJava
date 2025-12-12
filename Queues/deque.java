package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(4);
        dq.add(5);
        dq.add(6);
        dq.add(7);

        dq.addFirst(3);//vip
        dq.addLast(8);

        for(int nums: dq){
            System.out.println(nums);
        }
    }
}