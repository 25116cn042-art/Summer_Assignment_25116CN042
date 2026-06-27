package Day_28;
import java.util.Scanner;
public class TicketBookSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ticketIds = new int[10];
        String[] names = new String[10];
        int[] seatNumbers = new int[10];
        
        int count = 0;

        while (true) {
            System.out.println("\n1. Book Ticket | 2. View All Bookings | 3. Cancel Ticket | 4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= 10) {
                        System.out.println("All tickets sold out!");
                        break;
                    }
                    
                    System.out.print("Enter Seat Number (1-50): ");
                    int chosenSeat = sc.nextInt();
                    
                    boolean seatTaken = false;
                    for (int i = 0; i < count; i++) {
                        if (seatNumbers[i] == chosenSeat) {
                            seatTaken = true;
                            break;
                        }
                    }
                    
                    if (seatTaken) {
                        System.out.println(" Sorry, Seat " + chosenSeat + " is already booked!");
                    } else {
                        
                        seatNumbers[count] = chosenSeat;
                        System.out.print("Enter Ticket ID: ");
                        ticketIds[count] = sc.nextInt();
                        sc.nextLine(); 
                        System.out.print("Enter Passenger Name: ");
                        names[count] = sc.nextLine();
                        
                        System.out.println("🎉 Ticket booked successfully for Seat " + chosenSeat + "!");
                        count++;
                    }
                    break;

                case 2:
                 
                    if (count == 0) {
                        System.out.println("No active bookings found.");
                    } else {
                        System.out.println("\n--- Reservation Directory ---");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Ticket ID: " + ticketIds[i] + " | Passenger: " + names[i] + " | Seat No: " + seatNumbers[i]);
                        }
                    }
                    break;

                case 3:
                 
                    System.out.print("Enter Ticket ID to cancel: ");
                    int targetId = sc.nextInt();
                    boolean found = false;

                    for (int i = 0; i < count; i++) {
                        if (ticketIds[i] == targetId) {
                            found = true;
                            System.out.println("Booking for " + names[i] + " (Seat " + seatNumbers[i] + ") cancelled.");
                          
                            for (int j = i; j < count - 1; j++) {
                                ticketIds[j] = ticketIds[j + 1];
                                names[j] = names[j + 1];
                                seatNumbers[j] = seatNumbers[j + 1];
                            }
                            count--; 
                            break;
                        }
                    }
                    if (!found) System.out.println(" Ticket ID not found.");
                    break;

                case 4:
                    System.out.println("Thank you for using our booking system. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("----------------------------------------");
        }
    }
}
