package Day_28;
import java.util.Scanner;
public class ContManagSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[10];
        String[] phoneNum = new String[10];
        String[] email = new String[10];
        int count = 0;
        while(true) {
            System.out.println("\n1.Add contact | 2. View all | 3. Search name | 4. Exit");
            System.out.println("Enter choice:");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    if(count >= 10) {
                        System.out.println("Contact list full!");
                        break;
                    }
                    sc.nextLine();
                    System.out.print("\nEnter Name:");
                    name[count] = sc.nextLine();
                    System.out.print("Enter phoneNo:");
                    phoneNum[count] = sc.nextLine();
                    System.out.print("Enter email:");
                    email[count] = sc.nextLine();
                    System.out.println("Contact saved successfully for" + name[count]);
                    count++;
                    break;
                case 2 :
                    if (count == 0) {
                        System.out.println("Your contact book is empty.");
                    }
                    else {
                        for(int i = 0;i < count;i++) {
                            System.out.println("Name: " + name[i] + " | Phone: " + phoneNum[i] + " | Email: " + email[i]);
                        }
                    }
                    break;
                case 3:
                         if (count == 0) {
                        System.out.println("Your contact book is empty.");
                    }
                        System.out.print("Enter Name to search: ");
                        String targetName = sc.nextLine();
                        boolean found = false;
                        for (int i = 0; i < count; i++) {
                        if (name[i].equalsIgnoreCase(targetName)) {
                            System.out.println("\n Contact Found:");
                            System.out.println("Name: " + name[i] + "\nPhone: " + phoneNum[i] + "\nEmail: " + email[i]);
                            found = true;
                            break;
            }
        }
                        if (!found) {
                        System.out.println(" No contact found with the name '" + targetName + "'.");
                    }
                          break;

                case 4:
                    System.out.println("Closing Contact Book. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("----------------------------------------");
    }
}
    }