/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    List<Integer> ret = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return ret;

    }
    public void inorder(TreeNode root) {
        if(root == null) return;
        inorder(root.left);
        ret.add(root.val);
        inorder(root.right);
    }
}