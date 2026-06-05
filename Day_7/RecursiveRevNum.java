package Day_7;
import java.util.Scanner;
public class RecursiveRevNum {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = sc.nextInt();
            System.out.println("Reversed number is : " + revNum(n) );
        }
    }
    public static int revNum(int n) {
        int rev = 0;
        while(n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
