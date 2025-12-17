package HundredBasicCodes;

public class sumRange45 {
    public int sumRange(int s, int e){
        int sum = 0;
        while(s <= e){
            sum = sum + s;
            s++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int lr = 10;
        int hr = 12;
        sumRange45 sr = new sumRange45();
        int res = sr.sumRange(lr, hr);
        System.out.println("Sum from range " + lr + " to " + hr + " is " + res);
    }
}