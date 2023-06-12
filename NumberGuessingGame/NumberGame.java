package NumberGuessingGame;

import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 90) + 10; // Generate a random two-digit number
        int numGuesses = 0;
        boolean wonTheGame = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have 5 attempts to guess a two-digit number.");

        while (numGuesses < 5) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();

            numGuesses++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You hit the target number.");
                wonTheGame = true;
                break;
            } else if (guess > targetNumber) {
                System.out.println("Your guess is larger than the target number.");
            } else {
                System.out.println("Your guess is smaller than the target number.");
            }

            if (Math.abs(guess - targetNumber) >= 20) {
                System.out.println("You're far away from the target number.");
            }
        }

        if (!wonTheGame && numGuesses >= 5) {
            System.out.println("Game over! You've reached the maximum number of guesses.");
            System.out.println("The target number was: " + targetNumber);
        }

        scanner.close();
    }
}