/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
                return 0;
            }
            int leftD= diameterOfBinaryTree(root.left);
            int rightD= diameterOfBinaryTree(root.right);
            int maxheight= Height(root.left)+Height(root.right);
            return Math.max(maxheight, Math.max(leftD,rightD));
    }
    public static int Height(TreeNode root){
            if(root==null){
                return 0;
            }
            int leftheight= Height(root.left);
            int rightheight= Height(root.right);
            return Math.max(leftheight,rightheight)+1 ;
        }
}