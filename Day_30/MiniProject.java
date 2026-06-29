package Day_30;
import java.util.Scanner;
public class MiniProject {
    static String[] cars = new String[10];
    static String[] drivers = new String[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Park Car | 2. View All | 3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            if (choice == 1) {
                parkCar(sc); 
            } else if (choice == 2) {
                displayCars(); 
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }

    public static void parkCar(Scanner sc) {
        if (count >= 10) {
            System.out.println("Parking full!");
            return;
        }
        System.out.print("Car Number: ");
        cars[count] = sc.nextLine();
        System.out.print("Driver Name: ");
        drivers[count] = sc.nextLine();
        
        System.out.println(" Car parked in Slot " + (count + 1));
        count++;
    }

    public static void displayCars() {
        if (count == 0) {
            System.out.println("Parking is empty.");
            return;
        }
        System.out.println("\n--- Parked Cars ---");
        for (int i = 0; i < count; i++) {
            System.out.println("Slot " + (i + 1) + " -> Number: " + cars[i] + " | Driver: " + drivers[i]);
        }
    }
}