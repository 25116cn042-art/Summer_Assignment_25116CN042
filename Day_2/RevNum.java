package Day_2;

public class RevNum {
     static int reversed = 0;
    public static void main(String[] arg) {
        int n=809;
        int reversed = revNum(n);
        System.out.println("reverse of " + n +" is: "+reversed);
    }

    public static int revNum(int n) {
        if(n==0) {
            return reversed;
        }
        reversed = (reversed * 10) + (n % 10);
        return revNum(n / 10);
    }
}
