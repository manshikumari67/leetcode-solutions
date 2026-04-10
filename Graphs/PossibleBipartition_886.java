package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 886. Possible Bipartition

// We want to split a group of n people (labeled from 1 to n) into two groups of any size. Each person may dislike some other people, and they should not go into the same group.
// Given the integer n and the array dislikes where dislikes[i] = [ai, bi] indicates that the person labeled ai does not like the person labeled bi, return true if it is possible to split everyone into two groups in this way.

 

public class PossibleBipartition_886 {
     public boolean bfs(ArrayList<Integer>[] graph, int i, int[] color){
        Queue<Integer> q = new LinkedList<>();
        q.offer(i);
        color[i] = 0;
        while(!q.isEmpty()){
            int curr = q.poll();
            for(int ngbr : graph[curr]){
                if(color[ngbr]==-1){ // not colored, means not visited
                    if(color[curr]==1) color[ngbr] = 0; // color it
                    else color[ngbr] = 1;
                    q.offer(ngbr);
                }else if(color[curr]==color[ngbr]) return false; // same color of ngbr as curr => no bipartition possible
            }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        // Exact same question LC - 785 Is Graph Bipartite?
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for(int i=1; i<n+1; i++){
            graph[i] = new ArrayList<>();
        }
        for(int[] e : dislikes){
            int u = e[0];
            int v = e[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        // Graph coloring approach using only two colors
        int[] color = new int[n+1];
        Arrays.fill(color, -1);
        for(int i=1; i<n+1; i++){
            if(color[i]==-1){ // if not colored means not visited yet
                if(!bfs(graph, i, color)) return false;
            }
        }
        return true;
    }
}
