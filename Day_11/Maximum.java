package Day_11;
import java.util.Scanner;
public class Maximum {
    public static int maximum(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
        }
        public static void main(String[] args) {
            try(Scanner sc = new Scanner(System.in)) {
                System.out.print("Enter a number:");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int max = maximum(a,b);
                System.out.println("Maximum of numbers is:" + max);
            }
        }
    }
