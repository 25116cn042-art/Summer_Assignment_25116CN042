package Day_30;
import java.util.Scanner;

public class MiniEmploMan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int[] ids = new int[5];
        String[] names = new String[5];
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Employee | 2. View All | 3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
               
                if (count >= 5) {
                    System.out.println("Database full!");
                } else {
                    System.out.print("ID: ");
                    ids[count] = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    names[count] = sc.nextLine();
                    
                    count++;
                    System.out.println(" Employee Added!");
                }
            } else if (choice == 2) {
               
                if (count == 0) {
                    System.out.println("No records found.");
                } else {
                    System.out.println("\n--- Directory ---");
                    for (int i = 0; i < count; i++) {
                        System.out.println("ID: " + ids[i] + " | Name: " + names[i]);
                    }
                }
            } else if (choice == 3) {
               
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid option.");
            }
            System.out.println("--------------------------------");
        }
        sc.close();
    }
}