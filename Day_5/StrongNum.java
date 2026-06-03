package Day_5;

public class StrongNum {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;
        int sum = 0;
        while(temp > 0) {
          int digit = temp % 10;
          sum += factorial(digit);
            temp /= 10;
        } 
        if(sum == num) {
            System.out.println(num + " is a Strong number.");
        } else {
            System.out.println(num + " is not a Strong number.");

        }
    }
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
    
