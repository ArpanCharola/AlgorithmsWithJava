package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(n));
    }
    int fibonacci(int n){
        if(n < 2) return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
