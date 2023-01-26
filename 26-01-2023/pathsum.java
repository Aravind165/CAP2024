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
    public boolean pathsum(TreeNode root,int sum,int t){
        if(root==null){
            if((sum+root.val)==t){
            return true;
        }
        }
        if(root.left==null && root.right==null){
            if((sum+root.val)==t){
                return true;
            }
            return false;
        }

        if(root.right==null){
            return pathsum(root.left,sum+root.val,t);
        }
        if(root.left==null){
            return pathsum(root.right,sum+root.val,t);
        }
        return pathsum(root.left,sum+root.val,t) || pathsum(root.right,sum+root.val,t);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        int sum=0;
        return pathsum(root,sum,targetSum);
        
    }
}