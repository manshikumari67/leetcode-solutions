package Graphs;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// 841. Keys and Rooms

// There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
// When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
// Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.

public class KeysAndRooms_841 {
     public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n=rooms.size();
        boolean[] visited=new boolean[n];
        visited[0]=true;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        while(q.size()>0){
            int front=q.remove();
            for(int ele: rooms.get(front)){
                if(!visited[ele]){
                    q.add(ele);
                    visited[ele]=true;
                }
            }
        }

        for(boolean flag : visited){
            if(!flag) return false;
        }

        return true;
    } 
}
