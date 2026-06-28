package Day_29;
import java.util.Scanner;
public class MenuDriveCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("\n=== MENU CALCULATOR ===");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            int choice = sc.nextInt();
            if( choice == 5) {
                System.out.println("Exiting calculator.... goodbye!");
                break;
            }
            if(choice < 1 || choice > 5) {
                System.out.println("Invalid choice.Please choose from 1 to 5.");
                continue;
            }
            System.out.print("Enter first name:");
            double num1 = sc.nextDouble();
            System.out.print("Enter second name:");
            double num2 = sc.nextDouble();
            switch(choice) {
                case 1:
                    System.out.println("Result : " + num1 + " + " + num2 + " = " + (num1+num2));
                    break;
                case 2:
                    System.out.println("Result: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Result: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;

                case 4:
                    if (num2 == 0) {
                        System.out.println(" Error: Division by zero is not allowed!");
                    } else {
                        System.out.println("Result: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
            }
            System.out.println("--------------------------------");
        }
        sc.close();
            }
        }
