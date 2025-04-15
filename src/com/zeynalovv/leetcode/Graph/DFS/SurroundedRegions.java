package com.zeynalovv.leetcode.Graph.DFS;

public class SurroundedRegions {
    static int n, m, ans = 0;
    public static void solve(char[][] board) {
        n = board.length;
        m = board[0].length;
        int[] arr = new int[n*m+1];
        int[] size = new int[n*m+1];
        for(int i = 1; i <= n*m; i++) {
            arr[i] = i;
            size[i] = 1;
        }
        int[][] dp = new int[n][m];
        for(int i = 0; i < m; i++){
            if(board[0][i] == 'O') {
                check(0, i, board, dp);
            }
        }
        for(int i = 0; i < n; i++){
            if(board[i][0] == 'O') {
                check(i, 0, board, dp);
            }
        }
        for(int i = 0; i < m; i++){
            if(board[n-1][i] == 'O') {
                check(n-1, i, board, dp);
            }
        }
        for(int i = 0; i < n; i++){
            if(board[i][m-1] == 'O') {
                check(i, m-1, board, dp);
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(dp[i][j] == 1) board[i][j] = 'O';
                else board[i][j] = 'X';
            }
            //System.out.println();
        }

    }


    public static void check(int i, int j, char[][] board, int[][] dp){
        dp[i][j] = 1;
        ans++;
        if(i+1 < n && board[i+1][j] == 'O' && dp[i+1][j] == 0){
            dp[i+1][j] = 1;
            check(i+1, j, board, dp);
        }
        if(i > 0 && board[i-1][j] == 'O' && dp[i-1][j] == 0){
            dp[i-1][j] = 1;
            check(i-1, j, board, dp);
        }
        if(j+1 < m && board[i][j+1] == 'O' && dp[i][j+1] == 0){
            dp[i][j+1] = 1;
            check(i, j+1, board, dp);
        }
        if(j > 0 && board[i][j-1] == 'O' && dp[i][j-1] == 0){
            dp[i][j-1] = 1;
            check(i, j-1, board, dp);
        }
    }
}