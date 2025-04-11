package com.zeynalovv.leetcode.DP;

import java.util.ArrayList;
import java.util.List;

class DivisorGame {
    public boolean divisorGame(int n) {
        int k = 0;
        while(n != 1){
            k++;
            n--;
        }
        List<String> t = new ArrayList<>();
        return k % 2 == 0 ? false : true;
    }
}
