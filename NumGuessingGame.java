import java.util.Scanner;
import java.util.Random;

public class NumGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int score = 0;

        System.out.println("...Welcome to the Game...");

        while (playAgain) {
            int attempts = 0;
            int generatedNum = random.nextInt(100) + 1; 
            boolean correctGuess = false;

             

            while ( attempts < 10 &&  !correctGuess) { 
                System.out.print("Enter your guess (attempt " + (attempts + 1) + "): ");
                int guess = scanner.nextInt();
                scanner.nextLine(); 

                if (guess < 1 || guess > 100) {
                    System.out.println("Not valid number . please Enter number between 1 to 100.");
                    continue;
                }

                if (guess == generatedNum) {
                    System.out.println("Congratulations! You guessed the number " + generatedNum + " correctly!");
                    correctGuess = true;
                    score += 10 - attempts; // Score calculation
                } else if (guess < generatedNum) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                attempts++;
            }

            if (!correctGuess) {
                System.out.println("Sorry, you did not guess the number. It was " + generatedNum+ ".");
            }

            System.out.print("Your score: " + score);
            System.out.println("\nDo you want to try again ?? (yes/no): ");
            String playAgainResponse = scanner.nextLine().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
                System.out.println("Thanks for playing... Your final score is: " + score);
            }
        }

        scanner.close();
    }
}
