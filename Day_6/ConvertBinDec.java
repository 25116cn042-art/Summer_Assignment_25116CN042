package Day_6;
import java.util.Scanner;
public class ConvertBinDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number: ");
        String binary = sc.nextLine();
        int decimalValue = Integer.parseInt(binary, 2);
        System.out.println("Decimal value: " + decimalValue);
        sc.close();
    }
     public static int covertBinaryToDecimal(String binary) {
        int decimalValue = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            char bit = binary.charAt(length - 1 - i);
            if (bit == '1') {
                decimalValue += Math.pow(2, i);
            }
        }
        return decimalValue;
     }
    
}
