package com.zeynalovv.leetcode.DP;

public class CoinChange {


    static void split(int[] coins, int target, int ans, int eded){
        if(target == 0) {
            System.out.println(ans + " " + eded);
            ans = 0;
            return;
        }
        //System.out.println(target);
        for (int i = 0; i < coins.length; i++) {
            if(target>=coins[i]){
                ans++;
                split(coins, target-coins[i], ans, coins[i]);
            }
        }
    }





    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int target = 11;

        split(coins, target, 0, 0);

    }
}
