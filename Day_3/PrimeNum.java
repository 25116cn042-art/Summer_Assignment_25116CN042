package Day_3;

import java.util.Scanner;

public class PrimeNum {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
        System.out.println(num + " is not a prime.");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.println(num + " is not a prime.");
                    sc.close();
                    return;
                }
            System.out.println(num + " is a prime.");
            }
        }
        
        sc.close();
}
}
