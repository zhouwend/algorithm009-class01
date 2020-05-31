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
    public List<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
        return ret;

    }
    public void preorder(TreeNode root) {
        if(root == null) return;
        ret.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}