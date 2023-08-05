import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

//    public static char [][] createBoard(){
//        char [][] board = new char[4][4];
//        for( int i=0; i<4; i++){
//            for( int j=0; j<4; j++){
//                board[i][j] = '-'
//            }
//        }
//        return board;
//    }
    public static String [][] board = new String[4][4];
    public static String [][] cards = new String[4][4];
    public static Scanner scan = new Scanner(System.in);

    public static void printBoard(){

        for( int i=0; i<4; i++){
            System.out.print("|");
            for( int j=0; j<4; j++){
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

    public static void shuffleCards(){
        Random random = new Random();
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("G");
        letters.add("H");
        letters.add("A");
        letters.add("B");
        letters.add("C");
        letters.add("D");
        letters.add("E");
        letters.add("G");
        letters.add("H");
        int index;
        for(int i =0; i<4; i++){
            for(int j =0; j<4; j++){
                index = random.nextInt(letters.size());
                cards[i][j] = letters.get(index);
                letters.remove(index);
            }
        }
    }

    public static void checkInput(String[][] cards ){
        while(true){
            if(!gameOver){
                System.out.println("Row: (1-4)");
                int row1 = scan.nextInt();
                System.out.println("Cplumn: (1-4)");
                int col1 = scan.nextInt();

                if(!board[row1 - 1][col1 - 1].equals(" _ ")){
                    System.out.println("Already entered!!");
                    System.out.println();

                    printBoard();
                    continue;
                }else{
                    board[row1 - 1][col1 - 1] = " " + cards[row1-1][col1-1] + " ";
                    printBoard();
                }

                System.out.println("Row: (1-4)");
                int row2 = scan.nextInt();
                System.out.println("Cplumn: (1-4)");
                int col2 = scan.nextInt();

                if(!board[row2 - 1][col2 - 1].equals(" _ ")){
                    System.out.println("Already entered!!");
                    System.out.println();

                    printBoard();
                    continue;
            }
        }
    }


}
