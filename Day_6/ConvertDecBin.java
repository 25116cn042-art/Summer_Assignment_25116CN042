package Day_6;
import java.util.Scanner;
public class ConvertDecBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        String binaryNumber = convertDecimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryNumber);
        sc.close();
    }

    public static String convertDecimalToBinary(int decimal) {
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal /= 2;
        }
        return binary.length() > 0 ? binary.toString() : "0";
    }
}