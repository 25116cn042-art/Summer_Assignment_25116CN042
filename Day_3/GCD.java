package Day_3;
import java.util.Scanner;

public class GCD {
    public static void main(String[]args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number: ");
            int num1 = sc.nextInt();
            System.out.println("Enter second number: ");
            int num2 = sc.nextInt();
            int gcd = findGCD(num1,num2);
            System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        }
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;   
        }
        return a;
    }
}