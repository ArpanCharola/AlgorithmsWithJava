package HundredBasicCodes;

public class leapYear8 {
    public boolean leapYrOrNot(int year){
        //400    (n%400 == 0  and  n%4 == 0 aur n % 100 !=0)
        if(year % 400 == 0) return true;
        else if (year % 4 == 0 && year % 100 != 0) return true;
        else return false;
    }
    public static void main(String[] args) {
        int year = 2004;
        leapYear8 ly = new leapYear8();
        boolean res = ly.leapYrOrNot(year);
        System.out.println(res);
    }
}