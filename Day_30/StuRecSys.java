package Day_30;
import java.util.Scanner;
public class StuRecSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[10];
        String[] rollNumbers = new String[10];
        String[] courses = new String[10];
        
        int count = 0; 
        while (true) {
            System.out.println("\n=== STUDENT RECORD SYSTEM ===");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Record by Roll No");
            System.out.println("4. Exit");
            System.out.print("Enter choice (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    
                    if (count >= 10) {
                        System.out.println(" System database storage full!");
                        break;
                    }
                    System.out.print("Enter Student Name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    rollNumbers[count] = sc.nextLine();
                    System.out.print("Enter Branch/Course: ");
                    courses[count] = sc.nextLine();
                    
                    System.out.println(" Student record saved successfully!");
                    count++;
                    break;

                case 2:
                    
                    if (count == 0) {
                        System.out.println("Database is empty. No records found.");
                    } else {
                        System.out.println("\n--- Registered Student Directory ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll No: " + rollNumbers[i] + 
                                               " | Name: " + names[i] + 
                                               " | Course: " + courses[i]);
                        }
                    }
                    break;

                case 3:
                
                    if (count == 0) {
                        System.out.println("Database is empty. Nothing to search.");
                        break;
                    }
                    System.out.print("Enter Roll Number to search: ");
                    String targetRoll = sc.nextLine();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        
                        if (rollNumbers[i].equals(targetRoll)) {
                            System.out.println("\n Match Found:");
                            System.out.println("Roll No: " + rollNumbers[i] + 
                                               "\nName: " + names[i] + 
                                               "\nCourse: " + courses[i]);
                            found = true;
                            break; 
                        }
                    }
                    if (!found) {
                        System.out.println(" No student record found matching Roll No: " + targetRoll);
                    }
                    break;

                case 4:
                    System.out.println("Exiting Student Directory. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }
            System.out.println("----------------------------------------");
        }
    }
}