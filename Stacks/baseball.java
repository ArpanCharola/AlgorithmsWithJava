package Stacks;
import java.util.*;

public class baseball {
    public int baseballGame(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int last = stack.pop();
                int secondLast = stack.peek();
                int sum = last + secondLast;
                stack.push(last);
                stack.push(sum);

            } else if (op.equals("C")) {
                stack.pop();

            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);

            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int result = 0;
        for (int score : stack) {
            result += score;
        }

        return result;
    }

    public static void main(String[] args) {
        baseball b = new baseball();
        String[] ops = {"5", "2", "C", "D", "+"};
        int x = b.baseballGame(ops);

        System.out.println(x);  
    }
}