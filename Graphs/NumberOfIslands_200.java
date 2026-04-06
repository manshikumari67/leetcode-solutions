package Graphs;

// 200. Number of Islands

// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

public class NumberOfIslands_200 {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    private void dfs(char[][] grid, int i, int j){
        int n = grid.length;
        int m = grid[0].length;

        // boundary + water check
        if(i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == '0'){
            return;
        }

        // mark visited
        grid[i][j] = '0';

        // explore 4 directions
        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    } 
}
