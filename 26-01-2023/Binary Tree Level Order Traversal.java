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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> lis = new ArrayList<>();
       if(root == null) {
           return lis;
       }
       Queue<TreeNode> queue = new LinkedList<TreeNode>();
       queue.add(root);
       while(!queue.isEmpty()) {
           int size = queue.size();
           List<Integer> ils = new ArrayList<>();
           for(int i = 0; i < size; i++) {
               TreeNode elem = queue.remove();
               ils.add(elem.val);
               if(elem.left != null)queue.add(elem.left);
               if(elem.right != null)queue.add(elem.right);
               

           }
           lis.add(ils);
       } 
       return lis;
    }
}