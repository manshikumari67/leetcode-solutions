package DP;

// 1277.Count Square Submatrices with All Ones

// Given a m * n matrix of ones and zeros, return how many square submatrices have all ones.

public class CountSquareSubMatricesWithAllOnes_1277 {
     public int countSquares(int[][] arr) {
        int count=0;
        for(int i=0;i<arr.length;i++){
           for(int j=0;j<arr[0].length;j++){
            if(i!=0 && j!=0){
                if(arr[i][j]==1){
                    arr[i][j]+=Math.min(arr[i-1][j],Math.min(arr[i][j-1],arr[i-1][j-1]));
                }
            }
            count+=arr[i][j];
           }
        }
        return count++;
    }
}
