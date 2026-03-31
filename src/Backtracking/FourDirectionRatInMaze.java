package Backtracking;

public class FourDirectionRatInMaze {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];

        int count = maze(0, 0, rows - 1, cols - 1, "", isVisited);
        System.out.println("Total paths: " + count);
    }

    private static int maze(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {

        // boundary checks
        if (sr < 0 || sc < 0 || sr > er || sc > ec) return 0;
        if (isVisited[sr][sc]) return 0;

        // destination reached
        if (sr == er && sc == ec) {
            System.out.println(s);
            return 1;
        }

        isVisited[sr][sc] = true;

        int count = 0;
        count += maze(sr, sc + 1, er, ec, s + "R", isVisited);
        count += maze(sr + 1, sc, er, ec, s + "D", isVisited);
        count += maze(sr, sc - 1, er, ec, s + "L", isVisited);
        count += maze(sr - 1, sc, er, ec, s + "U", isVisited);

        // backtracking
        isVisited[sr][sc] = false;

        return count;
    }
}
