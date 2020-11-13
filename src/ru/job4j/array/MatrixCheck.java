package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            char equal = board[row][0];
            if (board[row][i] != equal) {
                return false;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            char equal = board[i][column];
            if (board[i][column] != equal) {
                return false;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            char fills = board[i][i];
            if (board[i][i] == fills) {
                rsl[i] = board[i][i];
            }
        }
        return rsl;
    }
}