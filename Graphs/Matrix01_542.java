package Graphs;

import java.util.*;

// 542. 01 Matrix

// Given an m x n binary matrix mat, return the distance of the nearest 0 for each cell.

public class Matrix01_542 {

    class Pair {
        int row, col;
        Pair(int r, int c) {
            row = r;
            col = c;
        }
    }
    
    
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        
        int[][] dist = new int[m][n];
        Queue<Pair> q = new LinkedList<>();
        
        // Step 1: initialize
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(new Pair(i, j));
                } else {
                    dist[i][j] = -1; // unvisited
                }
            }
        }
        
        // directions (up, down, left, right)
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        // Step 2: BFS
        while(!q.isEmpty()) {
            Pair p = q.poll();
            
            for(int k = 0; k < 4; k++) {
                int nr = p.row + dr[k];
                int nc = p.col + dc[k];
                
                if(nr >= 0 && nr < m && nc >= 0 && nc < n && dist[nr][nc] == -1) {
                    dist[nr][nc] = dist[p.row][p.col] + 1;
                    q.add(new Pair(nr, nc));
                }
            }
        }
        
        return dist;
    }
}
