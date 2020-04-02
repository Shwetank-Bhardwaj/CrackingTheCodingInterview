package com.shwetank;

public class SymmetricTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        isSymmetric(null);
    }

    public static boolean isSymmetric(TreeNode p) {

        if(p == null){
            return true;
        }
        return isSameTree(p.left, p.right);
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }
        if(p.val == q.val){
            return isSameTree(p.left, q.right) && isSameTree(p.right, q.left);
        }else{
            return false;
        }
    }

}
