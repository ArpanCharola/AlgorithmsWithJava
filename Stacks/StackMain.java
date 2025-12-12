package Stacks;

public class StackMain {
    public static void main(String[] args) throws stackException{

    
    customStack stack = new customStack(5);

    stack.push(21);
    stack.push(45);
    stack.push(18);
    stack.push(33);
    stack.push(1);

    
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    }
}