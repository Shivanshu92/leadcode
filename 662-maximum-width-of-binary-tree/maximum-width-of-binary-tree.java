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
 class Pair{
    TreeNode node;
    long index;
    Pair(TreeNode node, long index){
        this.node = node;
        this.index = index;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        if(root==null){
            return 0;
        }
        q.add(new Pair(root,0));
        int maxWidth = 0;
        while(!q.isEmpty()){
            int size = q.size();
            long minIndex = q.peek().index;
            long first = 0;
            long last = 0;
            for(int i=0;i<size;i++){
                Pair front = q.remove();
                long index = front.index - minIndex;
                if(i==0){
                    first = index;
                }
                if(i==size-1){
                    last = index;
                }
                if(front.node.left!=null){
                    q.add(new Pair(front.node.left, 2*index));
                }
                if(front.node.right!=null){
                    q.add(new Pair(front.node.right, 2*index +1));
                }
            }
            maxWidth = (int) Math.max(maxWidth,(last - first + 1));
        }
        return maxWidth;
    }
}