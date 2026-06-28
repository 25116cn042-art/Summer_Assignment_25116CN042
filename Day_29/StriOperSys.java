package Day_29;
import java.util.Scanner;
public class StriOperSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial string to work with: ");
        String str = sc.nextLine();

        while (true) {
            System.out.println("\n=== STRING OPERATIONS MENU ===");
            System.out.println("1. Find Length of String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Reverse the String");
            System.out.println("4. Enter a New String");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                   
                    System.out.println(" Length of \"" + str + "\" is: " + str.length());
                    break;

                case 2:
                  
                    str = str.toUpperCase();
                    System.out.println(" Updated String: " + str);
                    break;

                case 3:
                   
                    String reversed = new StringBuilder(str).reverse().toString();
                    System.out.println(" Reversed String: " + reversed);
                    break;

                case 4:
                   
                    System.out.print("Enter new string: ");
                    str = sc.nextLine();
                    System.out.println(" Active string updated successfully!");
                    break;

                case 5:
                    System.out.println("Exiting System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-5.");
            }
            System.out.println("----------------------------------------");
        }
    }
}