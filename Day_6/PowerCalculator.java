package Day_6;
import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Enter a Power: ");
        int power = sc.nextInt();
        int result = 1;
        for(int i = 1; i <= power; i++) {
            result *= num;
        }
        System.out.println(num + " raised to the power of " + power + " is : " + result);
        sc.close();

    }
}
