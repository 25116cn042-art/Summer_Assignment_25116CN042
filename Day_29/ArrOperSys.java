package Day_29;
import java.util.Scanner;
public class ArrOperSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int size = 0; 

        while (true) {
            System.out.println("\n=== ARRAY OPERATIONS MENU ===");
            System.out.println("1. Insert Element");
            System.out.println("2. Display Array");
            System.out.println("3. Search Element (Linear Search)");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                  
                    if (size >= 10) {
                        System.out.println(" Array is full! Cannot insert more elements.");
                    } else {
                        System.out.print("Enter an integer value to insert: ");
                        arr[size] = sc.nextInt();
                        System.out.println( + arr[size] + " inserted at index " + size);
                        size++; 
                    }
                    break;

                case 2:
                  
                    if (size == 0) {
                        System.out.println("Array is empty.");
                    } else {
                        System.out.print("Current Array: [");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i]);
                             System.out.print(", ");
                        }
                        System.out.println("]");
                    }
                    break;

                case 3:
                   
                    if (size == 0) {
                        System.out.println("Array is empty. Nothing to search.");
                        break;
                    }
                    System.out.print("Enter the value to search for: ");
                    int target = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < size; i++) {
                        if (arr[i] == target) {
                            System.out.println(" Element found at index position: " + i);
                            found = true;
                            break; 
                        }
                    }
                    if (!found) {
                        System.out.println(" Element " + target + " not found in the array.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please select an option between 1 and 4.");
            }
            System.out.println("----------------------------------------");
        }
    }
}
