public class CountDig {
    public static void main(String[] args) {
        int n = 5745; 
        int count = countDig(n);
        System.out.println("The number of digits in " + n + " is: " + count);
    }

    public static int countDig(int n) {
        if (n < 10) {
            return 1; 
        }
        return 1 + countDig(n / 10); 
    }
}
