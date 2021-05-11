package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (row = 0; row < board.length; row++) {
            if (board[row] != board["X"]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
