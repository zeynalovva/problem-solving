package com.zeynalovv.leetcode;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int sum = 0, n = cost.length;
        int[] arr = new int[n+1];
        for(int i = 0;i<n;i++){
            arr[i] = cost[i];
        }
        arr[n] = 0;
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = arr[0];
        dp[2] = arr[1];
        for(int i = 2;i<=n;i++){
            dp[i+1] = Math.min(dp[i], dp[i-1]) + arr[i];
        }
        return dp[n+1];

    }
}
