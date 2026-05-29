public class SumN {
        public static void main(String[] args) {
        int n = 5; 
        int sum = sumN(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
    public static int sumN(int n) {
        if (n <= 0) {
            return 0; 
        }
        return n + sumN(n - 1); 
    }
}

