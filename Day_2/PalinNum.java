package Day_2;

public class PalinNum {
 static int reversed =0;
    public static void main(String[] arg) {
        int n = 121;
        if(ispalindrome(n)) {
            System.out.println(n +" is palindrome");
    }
        else {
            System.out.println(n + " is not palindrome");
        }
    }

    public static boolean ispalindrome(int n) {
    if(n < 0) {
        return false;
    }
    int reversedNum=revNum(n);
    return n ==reversedNum;
    }

    public static int revNum(int n) {
    if(n==0) {
        return reversed;
    }
    reversed = (reversed * 10) + (n % 10);
    return revNum(n / 10);
    }
}