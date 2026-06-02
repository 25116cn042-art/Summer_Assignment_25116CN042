package Day_4;

public class ArmstrongNum {
    public static void main(String[] args) {
        int num = 15;
        int originalNum = num;
        int remainder;
        int result = 0;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 2);
            originalNum /= 10;
        }
        if (result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

    }
}
