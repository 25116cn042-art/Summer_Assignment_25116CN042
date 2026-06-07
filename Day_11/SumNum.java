package Day_11;
import java.util.Scanner;
public class SumNum {
    public static int sumNum(int a, int b) {
        return a+ b;
    }
    public static void main(String[] args) {
     try( Scanner sc = new Scanner(System.in)) {
        System.out.print("Enter a number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumNum(a, b);
        System.out.println("Sum of numbers is:" + sum);
    }
    
}
}