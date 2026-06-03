package Day_5;

import java.util.Scanner;

public class LargePrimeNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        long num = sc.nextLong();
        
        System.out.println("The largest prime factor of " + num + " is: " + findLargestPrimeFactor(num));
        
        sc.close();
    }

    public static long findLargestPrimeFactor(long n) {
        long maxPrime = -1;
        while (n % 2 == 0) {
            maxPrime = 2;
            n /= 2;
        }
        for (int i = 3; i <= n/2; i += 2) {
            while (n % i == 0) {
                maxPrime = i;
                n /= i;
            }
        }
        if (n > 2) {
            maxPrime = n;
        }
        return maxPrime;
    }
}