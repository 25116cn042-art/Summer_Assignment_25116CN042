package Day_12;

public class PerfectNum {
    public static int perfect(int n) {
        int result = 0;
        for(int i = 1; i < n; i++) {
         if(n % i == 0) {
            result += i;
         }
        }
        return result;
    }
    public static void main(String[] args) {
        int n =6;
        int result = perfect(n);
        if(n == result) {
            System.out.println(n +" is a perfect number.");
        }
        else {
            System.out.println(n +" is not a perfect number.");
        }
    }
}
