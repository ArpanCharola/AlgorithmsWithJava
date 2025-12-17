package HundredBasicCodes;

public class greatest7 {
    public void greatestOne(int a, int b, int c){
        if(a > b && a > c){
            System.out.println(a);
        } else if (b > c){
            System.out.println(b);
        } else System.out.println(c);
    }
    public static void main(String[] args) {
        greatest7 g = new greatest7();
        g.greatestOne(9, 8, 21);
    }
}