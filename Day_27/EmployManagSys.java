package Day_27;
import java.util.Scanner;
class Employee {
    int ID;
    String name;
    double salary;

public Employee(int ID,String name,double salary ) {
    this.ID = ID;
    this.name = name;
    this.salary = salary;
} 
public void display() {
    System.out.println("ID no :" + ID + " | name :" + name + " | salary :" + salary + "%");
}
}
public class EmployManagSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] records = new Employee[50];
        int count = 0;
        System.out.println("=== Employee Record Management System ===");

        while (true) {
            System.out.println("\n1. Add Employee Record");
            System.out.println("2. View All Records");
            System.out.println("3. Search Employee by Roll No");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

        switch (choice) {
            case 1 :
                if(count >= records.length) {
                    System.out.println("Database full! Cannot add more records.");
                        break;
                }
                System.out.print("Enter id Number: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    records[count] = new Employee(id, name, salary);
                    count++;
                    System.out.println("🎉 Record added successfully!");
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("No records found in the database.");
                    } else {
                        System.out.println("\n--- Current Employee Directory ---");
                        for (int i = 0; i < count; i++) {
                            records[i].display();
                        }
                    }
                    break;

                case 3:
                    if (count == 0) {
                        System.out.println("No records available to search.");
                        break;
                    }
                    System.out.print("Enter id Number to search: ");
                    int searchID = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (records[i].ID == searchID) {
                            System.out.println("\n Record Found:");
                            records[i].display();
                            found = true;
                            break; 
                        }
                    }
                    if (!found) {
                        System.out.println(" Employee with Roll No " + searchID + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("Exiting System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid input! Select an option from 1 to 4.");
            }
            System.out.println("----------------------------------------");
        }
    }
}
