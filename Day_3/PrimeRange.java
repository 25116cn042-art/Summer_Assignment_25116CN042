package Day_3;

public class PrimeRange {
    public static void main(String[] args) {
        int low = 10, high = 50;
        System.out.println("Prime numbers between " + low + " and " + high + ":");
        for (int num = low; num <= high; num++) {
            if (isPrime(num)) {
          System.out.print(num + " ");
                }
            }
        }   
  
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i=2; i<=num/2; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}