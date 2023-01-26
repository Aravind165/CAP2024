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
    public HashMap<Integer,List<Integer>> tl(TreeNode root,int s,HashMap<Integer,List<Integer>> hm){
        List<Integer> ls =new ArrayList<>();
        
        if(root!=null){
            ls.add(root.val);
            if(hm.containsKey(s)){
                (hm.get(s)).addAll(ls);}
            else{
                hm.put(s,ls);
            }
           hm= tl(root.left,s+1,hm);
           hm=tl(root.right,s+1,hm);
        }
        return hm;

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        HashMap<Integer,List<Integer>> l= new HashMap<>();
        List<List<Integer>> ls1=new ArrayList<>();
        int s=0;
        if(root==null){
            return ls1;
        }
        l=tl(root,s,l);
        int k=0;
        for ( List<Integer> ls: l.values()){
            if(k==0){
                ls1.add(ls);
                k=1;
            }
            else{
                Collections.reverse(ls);
                ls1.add(ls);
                k=0;
            }
        }
        return ls1;
    }
        
}