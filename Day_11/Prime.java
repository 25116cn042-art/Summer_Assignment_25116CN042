package Day_11;
import java.util.Scanner;
public class Prime {
    public static int prime(int n) {
        if(n <= 1) {
            return 0;
        }
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
       try( Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a numbers:");
        int n = sc.nextInt();
        int result = prime(n);
        if(result == 1) {
            System.out.println(n + " is a prime.");
        }
        else {
            System.out.println(n +" is not prime.");
        }
    }
}
}