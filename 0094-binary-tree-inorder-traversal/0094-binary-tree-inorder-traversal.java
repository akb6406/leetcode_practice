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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res= new ArrayList<Integer>();
        in(root,res);
        return res;
        
    }
    public void in(TreeNode root, List<Integer> res){
       if(root ==null){
           return;
       } 
        
        in(root.left,res);
        res.add(root.val);
        in(root.right,res);
    }
}


















// List<Integer> res = new ArrayList<Integer>();
//     in(root,res);
//     return res;
// }

// public void in(TreeNode root,List<Integer> res){
//     if(root==null)
//         return;
//     in(root.left,res);
//     res.add(root.val);
//     in(root.right,res);