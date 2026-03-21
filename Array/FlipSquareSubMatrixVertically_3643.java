package Array;

// 3643. Flip Square Submatrix Vertically

// You are given a 0-indexed m x n integer matrix grid, and three integers x, y, and k. The submatrix of grid with the top-left corner at (x, y) and side length k is the k x k square matrix that starts at (x, y) and extends to (x + k - 1, y + k - 1).

public class FlipSquareSubMatrixVertically_3643 {
     public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
         int sc = y, ec = y + k - 1, sr = x;
        for (int j = sc; j <= ec; j++) {
            for (int i = 0; i < k / 2; i++) {
                int tmp = grid[sr+i][j];
                grid[sr+i][j] = grid[sr+k-i-1][j];
                grid[sr+k-i-1][j] = tmp;
            }
        }
        return grid; 
    }
}
