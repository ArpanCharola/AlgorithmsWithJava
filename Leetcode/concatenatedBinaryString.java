public class concatenatedBinaryString {
    public int concatenatedBinary(int n) {
        long val = 0;
        int MOD = 1000000007;
        
        for(int i = 0; i <= n; i++){
           int bits = Integer.toBinaryString(i).length();
           val = ((val << bits) + i) % MOD;
        }
        return (int) val;
    }
    public static void main(String[] args){
        concatenatedBinaryString cbs = new concatenatedBinaryString();
        System.out.println(cbs.concatenatedBinary(4));
    }
}
