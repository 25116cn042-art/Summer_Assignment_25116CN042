package Day_26;
import java.util.Scanner;
import java.util.Random;
public class NumGuesGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int secret = rd.nextInt(100) + 1;
        int attempts = 0;
        int guess = 0;
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a secret number between 1 and 100. Try to guess it!");
        System.out.println("---------------------------------------------------------");
        while (guess != secret) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > secret) {
                System.out.println("Too high! Try a smaller number.");
            } else if (guess < secret) {
                System.out.println("Too low! Try a larger number.");
            } else {
                System.out.println("\n🎉 Congratulations! You guessed the secret number!");
                System.out.println("It took you " + attempts + " attempts to win.");
            }
        }
        sc.close();
    }
}