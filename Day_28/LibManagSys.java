package Day_28;
import java.util.Scanner;
public class LibManagSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] bookIds = new int[10];
        String[] titles = new String[10];
        boolean[] isAvailable = new boolean[10];
        int count = 0;
        while (true) {
            System.out.println("\n1. Add Book | 2. View All | 3. Issue Book | 4. Return Book | 5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            switch(choice) {
                case 1: 
                if(count >= 10) {
                    System.out.println("Library shelf is full!");
                    break;
                }
                System.out.print("Enter bookId:");
                bookIds[count] = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter title:");
                titles[count] = sc.nextLine();
                isAvailable[count] = true;
                System.out.println("Book added successfully");
                count++;
                break;
                case 2:
                    if(count==0) {
                        System.out.println("No books in library.");
                    }
                    else {
                        System.out.println("\n--- Library Catalog ---");
                        for (int i = 0; i < count; i++) {
                            String status = isAvailable[i] ? "Available" : "Issued Out";
                            System.out.println("ID: " + bookIds[i] + " | Title: " + titles[i] + " | Status: " + status);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to Issue: ");
                    int issueId = sc.nextInt();
                    boolean foundIssue = false;

                    for (int i = 0; i < count; i++) {
                        if (bookIds[i] == issueId) {
                            foundIssue = true;
                            if (isAvailable[i]) {
                                isAvailable[i] = false; 
                                System.out.println(" Book '" + titles[i] + "' has been successfully issued.");
                            } else {
                                System.out.println(" Sorry, this book is already issued to someone else.");
                            }
                            break;
                        }
                    }
                    if (!foundIssue) System.out.println(" Book ID not found.");
                    break;

                case 4:
                    System.out.print("Enter Book ID to Return: ");
                    int returnId = sc.nextInt();
                    boolean foundReturn = false;

                    for (int i = 0; i < count; i++) {
                        if (bookIds[i] == returnId) {
                            foundReturn = true;
                            if (!isAvailable[i]) {
                                isAvailable[i] = true; 
                                System.out.println(" Book '" + titles[i] + "' returned successfully.");
                            } else {
                                System.out.println(" This book is already sitting on the shelf!");
                            }
                            break;
                        }
                    }
                    if (!foundReturn) System.out.println(" Book ID not found.");
                    break;

                case 5:
                    System.out.println("Exiting Library System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("----------------------------------------");
        }
    }
}