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
    public boolean isBalanced(TreeNode root) {
        return checkbalance(root) != -1;

        }
        public int checkbalance(TreeNode root){
            if(root==null)return 0;

            int LH=checkbalance(root.left);
            if(LH==-1)return -1;

            int RH=checkbalance(root.right);
            if(RH==-1)return -1;

            if(Math.abs(LH-RH)>1)return -1;

            return 1+Math.max(LH,RH);
        }
    }
