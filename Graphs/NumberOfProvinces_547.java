package Graphs;

import java.util.LinkedList;
import java.util.Queue;

// 547. Number of Provinces

// There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
// A province is a group of directly or indirectly connected cities and no other cities outside of the group.
// You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
// Return the total number of provinces.

public class NumberOfProvinces_547 {
     public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            if(!visited[i]){
                bfs(i, visited, isConnected);
                count++;
            }
        }

        return count;
    }

    private void bfs(int i, boolean[] visited, int[][] adj){
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        visited[i] = true;

        while(!q.isEmpty()){
            int front = q.poll();

            for(int j = 0; j < adj.length; j++){
                if(adj[front][j] == 1 && !visited[j]){
                    q.add(j);
                    visited[j] = true;
                }
            }
        }
    }
}
