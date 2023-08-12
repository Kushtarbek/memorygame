package controller;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static String generateRandomLetters() {
        Random random = new Random();
        StringBuilder letters = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char randomChar = (char) ('A' + random.nextInt(26)); // Generates a random letter (A-Z)
            letters.append(randomChar);
        }

        return letters.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Generate random letters
        String randomLetters = generateRandomLetters();
        System.out.println("Random letters: " + randomLetters);

        // Prompt the user for input
        System.out.print("Enter your guess: ");
        String userInput = scanner.nextLine();

        // Check if user input matches the random letters
        if (userInput.equalsIgnoreCase(randomLetters)) {
            System.out.println("Congratulations! Your guess is correct.");
        } else {
            System.out.println("Sorry, your guess is incorrect.");
        }

        scanner.close();
    }
}
