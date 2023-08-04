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

}
