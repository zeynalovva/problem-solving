package com.zeynalovv.leetcode.Tree.BinaryTree;

class SameTree {
    boolean ans = true;

    public void check(TreeNode p, TreeNode q){
        if(q == p && q == null) return;
        else if(q == null || p == null){
            ans = false;
            return;
        }

        if(p.val != q.val) ans = false;

        check(p.left, q.left);
        check(p.right, q.right);
    }


    public boolean isSameTree(TreeNode p, TreeNode q) {
        check(p, q);
        return ans;
    }
}