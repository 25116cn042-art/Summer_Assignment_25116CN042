package Day_12;

public class Armstrong {
    static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
        }
        return result;
    }
    static boolean isArmstrong(int n) {
        int temp = n;
        int result = 0;
        int digits = 0;

        if (n == 0) 
            digits = 1;
        while (n > 0) {
            digits++;
            n /= 10;
        }
        n = temp;
        while (n > 0) {
            int digit = n % 10;
            result += power(digit, digits);
            n /= 10;
        }
        return temp == result;
    }
    public static void main(String[] args) {
        int n = 153;

        if (isArmstrong(n)) {
            System.out.println(n + " is Armstrong number.");
        } else {
            System.out.println(n + " is not Armstrong number.");
        }
    }
}