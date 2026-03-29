package BackTracking;

// 37. Sudoku Solver

// Write a program to solve a Sudoku puzzle by filling the empty cells.
// A sudoku solution must satisfy all of the following rules:
// Each of the digits 1-9 must occur exactly once in each row.
// Each of the digits 1-9 must occur exactly once in each column.
// Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
// The '.' character indicates empty cells.

public class SudokuSolver_37 {
    public boolean isValid(char[][] board, int row, int col, char num){
        // to check the row
        for(int j=0;j<9;j++){
            if(board[row][j]==num) return false;
        }

        //  to check the col
        for(int i=0;i<9;i++){
            if(board[i][col]==num) return false;
        }

        // to check the 3x3 grid
        int sRow=row/3*3;
         int sCol=col/3*3;

         for(int i=sRow;i<sRow+3;i++){
            for(int j=sCol;j<sCol+3;j++){
                if(board[i][j]==num) return false;

            }
         }
           
           return true;
    }

    public void solve(char[][] board, int row, int col, char[][] grid){
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    grid[i][j]=board[i][j];
                }
            }
            return;
        }
        else if(board[row][col]!='.'){
            if(col!=8) solve(board,row,col+1,grid);
            else solve(board,row+1,0,grid);
        }
        else{
            for(char ch='1';ch<='9';ch++){
                if(isValid(board,row,col,ch)){
                    board[row][col]=ch;
                    if(col!=8) solve(board,row,col+1,grid);
                    else solve(board,row+1,0,grid);
                    board[row][col]='.';
                }
            }
        }
    }
    public void solveSudoku(char[][] board) {
        char[][] grid=new char[9][9];
        solve(board,0,0,grid);
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                board[i][j]=grid[i][j];
            }
        }
    }
}
