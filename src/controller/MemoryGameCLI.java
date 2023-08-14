package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MemoryGameCLI {
    private int turns = 0;
    private int points = 0;
    private final int boardLength = 3;
    private final int boardSize = boardLength * boardLength;
    private final Random random = new Random();

    private ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "X"));
    private final ArrayList<String> memoryBoard = new ArrayList<>(Arrays.asList("", "","","","","","", "", "X"));
    private final ArrayList<String> memoryOptions = new ArrayList<>(Arrays.asList("a", "a", "b","b","c","c","d", "d"));

    public void playGame(){
        boolean playing = true;
        setupMemoryBoard();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the CLI Memory Game");
        while(playing){
            System.out.println("Game state: ");
            printBoard(gameBoard);

            System.out.println("Input first index:");
            int firstIndex = scanner.nextInt();
        }
    }



}
