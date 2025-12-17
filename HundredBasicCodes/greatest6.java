package HundredBasicCodes;

public class greatest6 {
    public void greater(int a, int b){
        if(a > b) System.out.println(a + " is greater");
        else System.out.println(b + " is greater");
    }
    public static void main(String[] args) {
        greatest6 g = new greatest6();
        g.greater(7, 63);
    }
}