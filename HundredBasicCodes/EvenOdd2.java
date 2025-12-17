package HundredBasicCodes;

public class EvenOdd2 {
    public void oddEv(int n){
        if (n % 2 == 0) System.out.println(n + " is Even number");
        else System.out.println(n + " is Odd number");
    }
    public static void main(String[] args) {
        int n = 7;
        EvenOdd2 ev = new EvenOdd2();
        ev.oddEv(n);
    }
}