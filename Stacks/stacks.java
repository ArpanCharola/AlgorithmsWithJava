package Stacks;

import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(3);
        s.push(7);
        s.add(6);
        s.push(21);

        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}