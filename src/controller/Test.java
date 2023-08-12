package controller;

import java.util.Random;
import java.util.Scanner;

public class Test {


    public static char[][] createInitialMatrix(int rows, int columns) {
        char[][] matrix = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = '*';
            }
        }
        return matrix;
    }

    public static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int columns = 4;
        char[][] matrix = createInitialMatrix(rows, columns);

        printMatrix(matrix);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter row index (0-3): ");
        int rowIndex1 = scanner.nextInt();

        System.out.print("Enter column index (0-3): ");
        int colIndex1 = scanner.nextInt();

        System.out.print("Enter second row index (0-3, different from the first): ");
        int rowIndex2 = scanner.nextInt();
        System.out.print("Enter second column index (0-3, different from the first): ");
        int colIndex2 = scanner.nextInt();




    public static void revealRandomLetters(char[][] matrix, int row, int col) {
        Random random = new Random();
        char randomChar = (char) ('A' + random.nextInt(26)); // Generates a random letter (A-Z)
        matrix[row][col] = randomChar;
    }

//    public static void checkSelectedIndices(char[][] matrix) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Select the first index (row column) separated by space: ");
//        int firstRow = scanner.nextInt();
//        int firstColumn = scanner.nextInt();
//
//        System.out.print("Select the second index (row column) separated by space: ");
//        int secondRow = scanner.nextInt();
//        int secondColumn = scanner.nextInt();
//
//        if (isValidIndex(matrix, firstRow, firstColumn) && isValidIndex(matrix, secondRow, secondColumn)) {
//            matrix[firstRow][firstColumn] = matrix[secondRow][secondColumn] = 'X';
//            printMatrix(matrix);
//
//            if (firstRow == secondRow && firstColumn == secondColumn) {
//                System.out.println("Selected indices are identical.");
//            } else {
//                System.out.println("Selected indices are not identical.");
//            }
//        } else {
//            System.out.println("Invalid indices selected.");
//        }
//    }
//
//    public static boolean isValidIndex(char[][] matrix, int row, int column) {
//        return row >= 0 && row < matrix.length && column >= 0 && column < matrix[0].length;
//    }
}


