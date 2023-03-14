/******************************************************************************************************************************************************
---------------------
Level- Easy
Question NO-104
----------------------
Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

---------------------------------------------------------------------------------------
 

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 3
Example 2:

Input: root = [1,null,2]
Output: 2

----------------------------------------------------------------------------------------

*******************************************************************************************************************************************************/

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
    public int maxDepth(TreeNode root) {

        if(root == null) return 0;
        
        int depthLeft = maxDepth(root.left);
        int depthRight = maxDepth(root.right);

        if(depthLeft > depthRight) return 1+depthLeft;

        return 1+depthRight;  
    }
}
