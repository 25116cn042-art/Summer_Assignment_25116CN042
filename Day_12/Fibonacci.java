package Day_12;

public class Fibonacci {
    static int fibonacci(int n) {
        int a = 0;
        int b = 1;
        System.out.print("Fibonacci series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a +" ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
        return a;
    }
    public static void main(String[] args) {
        int n = 6;
        fibonacci(n);
    }
}
