package com.zeynalovv.leetcode.DP;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length+1];
        int max = -1000000;
        dp[0] = 0;
        dp[1] = nums[0];
        max = Math.max(dp[1], max);
        for(int i = 1;i<nums.length;i++){
            dp[i+1] = Math.max(nums[i], dp[i] + nums[i]);
            max = Math.max(dp[i+1], max);
        }
        return max;

    }
}
