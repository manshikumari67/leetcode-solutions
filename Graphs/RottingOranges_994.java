package Graphs;

import java.util.LinkedList;
import java.util.Queue;

// 994. Rotting Oranges

// You are given an m x n grid where each cell can have one of three values:
// 0 representing an empty cell,
// 1 representing a fresh orange, or
// 2 representing a rotten orange.
// Every minute, any fresh orange that is 4-directionally adjacent to a rotten orange becomes rotten.
// Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1.


public class RottingOranges_994 {
    public class Triplet{
        int row;
        int col;
        int time;
        Triplet(int row, int col, int time){
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        Queue<Triplet> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==2) // it is rotten at time=0
                    q.add(new Triplet(i,j,0));
            }
        }
        int maxtime = 0;
        while(q.size()>0){
            Triplet front = q.remove();
            int row = front.row, col = front.col, time = front.time;
            maxtime = Math.max(maxtime,time);
            // rotting left  (row,col-1)
            if(col-1 >= 0 && arr[row][col-1]==1){
                arr[row][col-1] = 2;
                q.add(new Triplet(row,col-1,time+1));
            }
            // rotting right  (row,col+1)
            if(col+1 < n && arr[row][col+1]==1){
                arr[row][col+1] = 2;
                q.add(new Triplet(row,col+1,time+1));
            }
            // rotting up  (row-1,col)
            if(row-1 >= 0 && arr[row-1][col]==1) {
                arr[row-1][col] = 2;
                q.add(new Triplet(row - 1, col, time + 1));
            }
            // rotting down  (row+1,col)
            if(row+1 < m && arr[row+1][col]==1) {
                arr[row+1][col] = 2;
                q.add(new Triplet(row + 1, col, time + 1));
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1) return -1;
            }
        }
        return maxtime;
    }
}
