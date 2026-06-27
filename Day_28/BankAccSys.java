package Day_28;
import java.util.Scanner;
public class BankAccSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] accountNumbers = new int[10];
        String[] names = new String[10];
        double[] balances = new double[10];
        
        int count = 0;

        while (true) {
            System.out.println("\n1. Open Account | 2. Deposit | 3. Withdraw | 4. View All | 5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= 10) {
                        System.out.println("Bank database full!");
                        break;
                    }
                    System.out.print("Enter New Account Number: ");
                    accountNumbers[count] = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Account Holder Name: ");
                    names[count] = sc.nextLine();
                    System.out.print("Enter Initial Deposit: ₹");
                    balances[count] = sc.nextDouble();
                    
                    System.out.println(" Account created successfully for " + names[count] + "!");
                    count++;
                    break;
                case 2:
                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();
                    boolean depFound = false;

                    for (int i = 0; i < count; i++) {
                        if (accountNumbers[i] == depAcc) {
                            depFound = true;
                            System.out.print("Enter amount to deposit: ₹");
                            double amount = sc.nextDouble();
                            if (amount > 0) {
                                balances[i] += amount; 
                                System.out.println(" Deposited! Updated Balance: ₹" + balances[i]);
                            } else {
                                System.out.println(" Invalid amount.");
                            }
                            break;
                        }
                    }
                    if (!depFound) System.out.println(" Account number not found.");
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int withAcc = sc.nextInt();
                    boolean withFound = false;

                    for (int i = 0; i < count; i++) {
                        if (accountNumbers[i] == withAcc) {
                            withFound = true;
                            System.out.print("Enter amount to withdraw: ₹");
                            double amount = sc.nextDouble();
                            if (amount > balances[i]) {
                                System.out.println(" Insufficient balance! Current Balance: ₹" + balances[i]);
                            } else if (amount <= 0) {
                                System.out.println(" Invalid amount.");
                            } else {
                                balances[i] -= amount; 
                                System.out.println(" Withdrawal successful! Remaining Balance: ₹" + balances[i]);
                            }
                            break;
                        }
                    }
                    if (!withFound) System.out.println(" Account number not found.");
                    break;

                case 4:
                    if (count == 0) {
                        System.out.println("No accounts registered in the system.");
                    } else {
                        System.out.println("\n--- Bank Account Directory ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Acc No: " + accountNumbers[i] + " | Name: " + names[i] + " | Balance: ₹" + balances[i]);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Thank you for banking with us. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("----------------------------------------");
        }
    }
}

