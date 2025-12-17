package HundredBasicCodes;

public class naturalNumSum3 {
    public int naturalSum(int n){
        int sum = 0;
        sum = (n*(n+1)/2);
        return sum;
    }
    public static void main(String[] args) {
        int n = 10;
        naturalNumSum3 ns = new naturalNumSum3();
        int res = ns.naturalSum(n);
        System.out.println("The sum of first " + n + " natural numbers is " + res);
    }
}