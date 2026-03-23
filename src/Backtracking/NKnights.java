package Backtracking;
public class NKnights {

    static int totalWays = 0;   // counts valid combinations

    public static void main(String[] args) {
        int n = 5;   // board size
        int k = 13;   // number of knights

        boolean[][] board = new boolean[n][n];
        placeKnights(board, 0, 0, k);

        System.out.println("Total valid combinations: " + totalWays);
    }

    static void placeKnights(boolean[][] board, int row, int col, int knightsLeft) {

        // Found a valid combination
        if (knightsLeft == 0) {
            printBoard(board);
            System.out.println();
            totalWays++;
            return;
        }

        // Board finished
        if (row == board.length) {
            return;
        }

        // Move to next row
        if (col == board.length) {
            placeKnights(board, row + 1, 0, knightsLeft);
            return;
        }

        // Option 1: Place knight
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            placeKnights(board, row, col + 1, knightsLeft - 1);
            board[row][col] = false; // backtrack
        }

        // Option 2: Skip cell
        placeKnights(board, row, col + 1, knightsLeft);
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

    static void printBoard(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean cell : row) {
                System.out.print(cell ? "K " : ". ");
            }
            System.out.println();
        }
    }
}
