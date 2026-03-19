package DP;

import java.util.List;

// 120. Triangle

// Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

public class Triangle_120 {
    public int minimumTotal(List<List<Integer>> triangle) {
         for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                int val = triangle.get(i).get(j) + 
                Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1));
                triangle.get(i).set(j, val);
            }
        }
        return triangle.get(0).get(0);
    }
}
