package Day_7;
import java.util.Scanner;
public class RecursiveSumDig {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            System.out.println("The sum of the digits is: " + sumDig(n));
        }
    }
    public static int sumDig(int n) {
        if (n == 0)
            return 0;
        return (n % 10) + sumDig(n / 10);
     }
}
