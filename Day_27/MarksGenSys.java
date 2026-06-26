package Day_27;
import java.util.Scanner;
public class MarksGenSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rollno = new int[10];
        String[] studentNames = new String[10];
        double[] percentages = new double[10];
        char[] finalGrades = new char[10];
        
        int count = 0;

        while (true) {
            System.out.println("\n1. Generate Marksheet | 2. View All Marksheets | 3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (count >= 10) {
                        System.out.println("Database full!");
                        break;
                    }
                    System.out.print("Enter Roll Number: ");
                    rollno[count] = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    studentNames[count] = sc.nextLine();
                    System.out.print("Enter Physics Marks (out of 100): ");
                    double physics = sc.nextDouble();
                    System.out.print("Enter Chemistry Marks (out of 100): ");
                    double chemistry = sc.nextDouble();
                    System.out.print("Enter Math Marks (out of 100): ");
                    double math = sc.nextDouble();
                    double totalMarks = physics + chemistry + math;
                    double percentage = totalMarks / 3.0;
                    percentages[count] = percentage;
                    char grade;
                    if (percentage >= 90) grade = 'A';
                    else if (percentage >= 75) grade = 'B';
                    else if (percentage >= 50) grade = 'C';
                    else grade = 'F';
                    
                    finalGrades[count] = grade;
                    
                    System.out.println(" Marksheet Generated! Percentage: " + String.format("%.2f", percentage) + "% | Grade: " + grade);
                    count++;
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No marksheets generated yet.");
                    } else {
                        System.out.println("\n================ STUDENT MARKSHEET DIRECTORY ================");
                        for (int i = 0; i < count; i++) {
                            System.out.println("Roll: " + rollno[i] + 
                                               " | Name: " + studentNames[i] + 
                                               " | Percentage: " + String.format("%.2f", percentages[i]) + "%" +
                                               " | Grade: " + finalGrades[i]);
                        }
                        System.out.println("=============================================================");
                    }
                    break;

                case 3:
                    System.out.println("Exiting Marksheet System. Goodbye!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println("-------------------------------------------------------------");
        }
    }
}
