package Day_27;
import java.util.Scanner;

public class SalManagSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] id = new int[10];
        String[] names = new String[10];
        double[] gross = new double[10];
        int count = 0;
        while (true) {
            System.out.println("\n1. Add Salary Slip | 2. View All | 3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    id[count] = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Basic Salary: ₹");
                    double basic = sc.nextDouble();
                    gross[count] = basic * 1.30;
                    System.out.println(" Calculated Gross Salary: ₹" + gross[count]);
                    count++;
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No records.");
                    } else {
                        for (int i = 0; i < count; i++) {
                            System.out.println("ID: " + id[i] + " | Name: " + names[i] + " | Gross: ₹" + gross[i]);
                        }
                    }
                    break;

                case 3:
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