package Day_4;

public class ArmstrongRange {
    public static void main(String[] args) {
        int low = 1;
        int high = 1000;
        System.out.println("Armstrong numbers between " + low + " and " + high + ":");
        for (int num = low; num <= high; num++) {
            int originalNum = num;
            int remainder;
            int result = 0;
            int n = String.valueOf(num).length();
            while (originalNum != 0) {  
                remainder = originalNum % 10;  
                result += Math.pow(remainder, n);  
                originalNum /= 10;  
            }
            if (result == num)
                System.out.print(num + " ");
        }
    }
}
