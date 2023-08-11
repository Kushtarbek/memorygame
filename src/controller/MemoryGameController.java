package controller;

import java.util.Scanner;

public class MemoryGameController {
    //public static String [][] board = new String[4][4];

    public static void main(String[] args) {
        int[][] matrix3 = { { 3, 2, 1, 7 },
                { 9, 11, 5, 4 },
                { 6, 0, 13, 17 },
                { 7, 21, 14, 15 } };
     printBoard(matrix3);

    }



    public static void printBoard(int mtx [][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // System.out.println(" X ");
                //System.out.println(board[i][j]);
                //System.out.print();
                System.out.print("* ");

               // System.out.print(mtx[i][j] + "\t");


            }
            System.out.println();
        }

    }

    public static void updateMatrix(int [][] matrix){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the first index (row column) separated by space: ");
        int firstRow = scanner.nextInt();
        int firstColumn = scanner.nextInt();

        System.out.println("Select the second index (row column) separated by space: ");
        int secondRow = scanner.nextInt();
        int secondColumn = scanner.nextInt();
//
//        if(isValidIndex(matrix, firstRow, firstColumn) && isValidIndex(matrix, secondRow, secondColumn)) {
//       // matrix[firstRow][firstColumn] =
//        }
    }



}
