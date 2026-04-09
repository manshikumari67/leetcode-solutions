package Graphs;

import java.util.LinkedList;
import java.util.Queue;

// 785. Is Graph Bipartite?

// There is an undirected graph with n nodes, where each node is numbered between 0 and n - 1. You are given a 2D array graph, where graph[u] is an array of nodes that node u is adjacent to. More formally, for each v in graph[u], there is an undirected edge between node u and node v. The graph has the following properties:
// There are no self-edges (graph[u] does not contain u).
// There are no parallel edges (graph[u] does not contain duplicate values).
// If v is in graph[u], then u is in graph[v] (the graph is undirected).
// The graph may not be connected, meaning there may be two nodes u and v such that there is no path between them.
// A graph is bipartite if the nodes can be partitioned into two independent sets A and B such that every edge in the graph connects a node in set A and a node in set B.
// Return true if and only if it is bipartite.



public class IsGraphBipartite {
      public boolean isBipartite(int[][] graph) {
        int n=graph.length;
    
        int[] vis=new int[n];
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                if(!  bfs(i,vis,graph)) return false;
            }
        }
        return true;
    }

    private boolean bfs(int src, int[] vis,int[][] adj ){
        vis[src]=1;
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(q.size()>0){
            int vertex=q.remove();
            int color=vis[vertex];
            for(int ele: adj[vertex]){
                if(vis[ele] ==0){
                    q.add(ele);
                    vis[ele]=3-color;
                }
                else if(vis[ele]==color) return false;
            }
        }
        return true;
    }
}
