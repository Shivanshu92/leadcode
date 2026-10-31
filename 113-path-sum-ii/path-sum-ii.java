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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root,targetSum,result,path);
        return result;
    }
    public void dfs(TreeNode node, int remainingSum, List<List<Integer>> result, List<Integer> path){
        if(node == null){
            return;
        }
        path.add(node.val);
        if(node.left==null && node.right==null){
            if(remainingSum == node.val){
                result.add(new ArrayList<>(path));
            }
        }
        else{
            dfs(node.left,remainingSum-node.val,result,path);
            dfs(node.right, remainingSum-node.val,result,path);
        }
        path.remove(path.size()-1);
    }
}