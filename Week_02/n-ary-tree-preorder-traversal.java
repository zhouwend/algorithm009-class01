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
    List<Integer> ls = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        preorders(root);
        return ls;
    }
    public void preorders(Node root) {
        if(root == null) {
            return ;
        }
        ls.add(root.val);
        int l = root.children.size();
        for(int i = 0; i < l; i++) {
            preorders(root.children.get(i));
        }
    }
}