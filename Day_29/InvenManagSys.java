package Day_29;
import java.util.Scanner;
public class InvenManagSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Productid = new int[10];
        String[] productNames = new String[10];
        int[] quantities = new int[10];
        
        int count = 0;

        while (true) {
            System.out.println("\n1. Add Product | 2. View Inventory | 3. Update Stock | 4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= 10) {
                        System.out.println("Warehouse storage full!");
                        break;
                    }
                    System.out.print("Enter Product ID: ");
                    Productid[count] = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Product Name: ");
                    productNames[count] = sc.nextLine();
                    System.out.print("Enter Stock Quantity: ");
                    quantities[count] = sc.nextInt();
                    
                    System.out.println(" Product added to inventory successfully!");
                    count++;
                    break;

                case 2:
                
                    if (count == 0) {
                        System.out.println("Inventory is empty.");
                    } else {
                        System.out.println("\n--- Current Warehouse Stock ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + Productid[i] + " | Name: " + productNames[i] + " | Qty: " + quantities[i]);
                        }
                    }
                    break;

                case 3:
                    
                    System.out.print("Enter Product ID to update: ");
                    int targetId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (Productid[i] == targetId) {
                            found = true;
                            System.out.print("Enter quantity change (positive to add stock, negative to subtract): ");
                            int stockChange = sc.nextInt();
                        
                            if (quantities[i] + stockChange < 0) {
                                System.out.println(" Error: Insufficient stock! Cannot reduce below 0.");
                            } else {
                                quantities[i] += stockChange; 
                                System.out.println(" Stock updated! New quantity for " + productNames[i] + ": " + quantities[i]);
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println(" Product ID not found.");
                    break;

                case 4:
                    System.out.println("Exiting Inventory System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
    }
}
}
