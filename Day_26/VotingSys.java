package Day_26;
import java.util.Scanner;
public class VotingSys {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int age = sc.nextInt();
        if(age >= 18) {
            System.out.println("Person is eligible for voting.");
        }
        else {
            System.out.println("person is not eligibe for voting.");
        }
    }
}
}
