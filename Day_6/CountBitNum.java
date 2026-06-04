package Day_6;
import java.util.Scanner;
public class CountBitNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        while(num != 0) {
            count += (num & 1);
            num >>= 1;
        }
        System.out.println("Number of set bits: " + count);
        sc.close();
        }

    }