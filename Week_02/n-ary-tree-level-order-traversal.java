/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<List<Integer>> ret = new ArrayList<List<Integer>>();
    public List<List<Integer>> levelOrder(Node root) {
        levels(root,0);
        return ret;
    }
    public void levels(Node node, int level) {
        if(node == null) {
            return;
        }
        if (ret.size() <= level) {
            ret.add(new ArrayList<>());
        }
        ret.get(level).add(node.val);
        for (Node child : node.children) {
            levels(child, level + 1);
        }
    }
}