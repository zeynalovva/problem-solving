package com.zeynalovv.leetcode.Tree.BinaryTree;

import javax.swing.tree.TreeNode;
import java.util.*;
import java.io.*;

public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
}

class BinaryTreeInorderTraversal {
    List<Integer> list = new ArrayList<>();
    public void rec(TreeNode root){

        if(root == null) return;


        rec(root.left);
        list.add(root.val);
        rec(root.right);
    }


    public List<Integer> inorderTraversal(TreeNode root) {
        rec(root);
        return list;
    }
}