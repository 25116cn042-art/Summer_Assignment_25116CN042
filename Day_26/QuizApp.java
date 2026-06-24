package Day_26;

import java.util.Scanner;

public class QuizApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "Which data structure follows the LIFO (Last In, First Out) principle?",
            "What is the time complexity of a standard Binary Search algorithm?",
            "Which keyword is used to allocate memory dynamically in C language?"
        };
        String[][] options = {
            {"1. Queue", "2. Stack", "3. Array", "4. Linked List"},
            {"1. O(N)", "2. O(N log N)", "3. O(log N)", "4. O(1)"},
            {"1. calloc", "2. malloc", "3. free", "4. alloc"}
        };
        int[] correctAnswers = {2, 3, 2}; 
        int score = 0;
        System.out.println("=== Welcome to the Computer Science Quiz ===");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < 4; j++) {
                System.out.println(options[i][j]);
            }
            
            System.out.print("Your answer (1-4): ");
            int userAnswer = sc.nextInt();
           
            if (userAnswer == correctAnswers[i]) {
                System.out.println(" Correct!");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was option " + correctAnswers[i]);
            }
        }
        System.out.println("\n--------------------------------------------");
        System.out.println("Quiz Completed!");
        System.out.println("Your Final Score: " + score + " / " + questions.length);
        
        sc.close();
    }
}
