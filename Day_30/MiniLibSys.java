package Day_30;
import java.util.Scanner;
public class MiniLibSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ids = new int[10];
        String[] titles = new String[10];
        boolean[] available = new boolean[10];
        
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Book | 2. View Catalog | 3. Issue/Return | 4. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                   
                    if (count >= 10) {
                        System.out.println("Library shelf full!");
                        break;
                    }
                    System.out.print("ID: ");
                    ids[count] = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Title: ");
                    titles[count] = sc.nextLine();
                    available[count] = true; 
                    
                    System.out.println(" Added!");
                    count++;
                    break;

                case 2:
                   
                    if (count == 0) {
                        System.out.println("Empty library.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            String status = available[i] ? "Available" : "Borrowed";
                            System.out.println("ID: " + ids[i] + " | " + titles[i] + " [" + status + "]");
                        }
                    }
                    break;

                case 3:
                   
                    System.out.print("Enter Book ID: ");
                    int targetId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (ids[i] == targetId) {
                            found = true;
                           
                            available[i] = !available[i]; 
                            String status = available[i] ? "Returned back to shelf." : "Issued out.";
                            System.out.println(" Status updated! Book is now: " + status);
                            break;
                        }
                    }
                    if (!found) System.out.println(" ID not found.");
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("--------------------------------");
        }
    }
}
