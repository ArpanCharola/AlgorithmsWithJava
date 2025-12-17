package HundredBasicCodes;

public class positiveNegative1 {
    public void positiveNegative(int n){
        if(n > 0) System.out.println(n + " is positive");
        else if (n < 0) System.out.println(n + " is negative");
        else System.out.println(n + " is zero");
    }
    public static void main(String[] args) {
        int n = -2;
        positiveNegative1 pn = new positiveNegative1();
        pn.positiveNegative(n);
    }
}