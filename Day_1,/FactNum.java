public class FactNum {
    public static void main(String[] args) {
        int n = 5; 
        int factorial = factNum(n);
        System.out.println("The factorial of " + n + " is: " + factorial);
    }

    public static int factNum(int n) {
        if (n <= 1) {
            return 1; 
        }
        return n * factNum(n - 1); 
    }
}
