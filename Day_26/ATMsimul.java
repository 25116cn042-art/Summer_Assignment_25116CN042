package Day_26;

import java.util.Scanner;

public class ATMsimul {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            double balance = 5000.00; 
        
        System.out.println("Welcome to the Gupta Bank ATM");
        System.out.println("-----------------------------");
        while (true) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Cash");
            System.out.println("4. Exit Machine");
            System.out.print("Please select an option (1-4): ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                  System.out.println("Current Balance: ₹" + balance);
                    break;
                    
                case 2:
                    System.out.print("Enter deposit amount: ₹");
                    double depositAmount = sc.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("Successfully deposited! New Balance: ₹" + balance);
                    } else {
                        System.out.println("Invalid amount!");
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter withdrawal amount: ₹");
                    double withdrawAmount = sc.nextDouble();
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds! Transaction denied.");
                    } else if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount!");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Please collect your cash. Remaining Balance: ₹" + balance);
                    }
                    break;
                    
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    sc.close();
                    return; 
                default:
                    System.out.println("Invalid choice! Please select a valid menu option.");
            }
            System.out.println("-----------------------------");  
     
}
        }
    }
}
