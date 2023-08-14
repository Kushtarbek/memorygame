package controller;

import java.util.*;

public class MemoryGame2 {

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

            System.out.println("Input first index:");
            int secondIndex = scanner.nextInt();

            if(showTwoPositions(firstIndex, secondIndex)){
                points++;
            }
            turns++;
            if( points == 4 ){
                playing = false;
            }
        }
        System.out.println("You won!");
        System.out.println("You won in "+turns+ " turns.");
    }


    private void setupMemoryBoard(){
        for( int i = 0; i < boardSize-1; i++){
            String memoryOption = memoryOptions.get(i);
            int position = random.nextInt(boardSize - 1);

            while(!Objects.equals(memoryBoard.get(position), "")){
                position = random.nextInt(boardSize - 1);
            }

            memoryBoard.set(position, memoryOption);
        }
    }

    private void printBoard(ArrayList<String> board){
        for( int row = 0; row < boardSize / 3; row++ ){
            System.out.printf("%s %12s %12s%n", board.get(row),
                    board.get( row + boardLength), board.get( row + boardLength * 2));
        }
    }

    private boolean showTwoPositions(int firstIndex, int secondIndex){
        String firstPick = memoryBoard.get(firstIndex);
        String secondPick = memoryBoard.get(secondIndex);

        ArrayList<String> gameState = (ArrayList<String>) gameBoard.clone();

        gameState.set(firstIndex, firstPick);
        gameState.set(secondIndex, secondPick);

        System.out.println("Your picks: ");
        printBoard(gameState);
        System.out.println("____________________________");

        if(firstPick.equals(secondPick)){
            gameBoard = (ArrayList<String>) gameState.clone();
            return true;
        }
        return false;
    }



}
