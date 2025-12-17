package HundredBasicCodes;

public class PrimeNumber9 {
    public void primeOrNot(int n){
        int count = 0;
        if(n < 2) System.out.println(n + " is Not Prime");

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 0) System.out.println(n + " is Prime");
        else System.out.println(n + " is Composite");
    }
    public static void main(String[] args) {
        int n = 4;
        PrimeNumber9 pn = new PrimeNumber9();
        pn.primeOrNot(n);
    }
}