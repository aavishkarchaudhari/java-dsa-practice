package Backtracking;

public class MaxKnights {

    static int maxKnights = 0;

    public static void main(String[] args) {
        int n = 5;   // board size

        boolean[][] board = new boolean[n][n];
        findMaxKnights(board, 0, 0, 0);

        System.out.println("Maximum knights possible: " + maxKnights);
    }

    static void findMaxKnights(boolean[][] board, int row, int col, int count) {

        // Finished board
        if (row == board.length) {
            maxKnights = Math.max(maxKnights, count);
            return;
        }

        // Move to next row
        if (col == board.length) {
            findMaxKnights(board, row + 1, 0, count);
            return;
        }

        // Option 1: Place knight if safe
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            findMaxKnights(board, row, col + 1, count + 1);
            board[row][col] = false; // backtrack
        }

        // Option 2: Skip this cell
        findMaxKnights(board, row, col + 1, count);
    }

    static boolean isSafe(boolean[][] board, int row, int col) {
        int[][] directions = {
                {-2, -1}, {-2, 1},
                {-1, -2}, {-1, 2}
        };

        for (int[] d : directions) {
            int r = row + d[0];
            int c = col + d[1];

            if (r >= 0 && c >= 0 && r < board.length && c < board.length) {
                if (board[r][c]) return false;
            }
        }
        return true;
    }
}
