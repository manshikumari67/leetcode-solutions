

// 993. Cousins In Binary Tree

// Given the root of a binary tree with unique values and the values of two different nodes of the tree x and y, return true if the nodes corresponding to the values x and y in the tree are cousins, or false otherwise.
// Two nodes of a binary tree are cousins if they have the same depth with different parents.
// Note that in a binary tree, the root node is at the depth 0, and children of each depth k node are at the depth k + 1.


public class CousinsInBT_993 {
     int xParent = -1, yParent = -1;
    int xDepth = -1, yDepth = -1;

    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, -1, 0, x, y);
        return xDepth == yDepth && xParent != yParent;
    }

    private void dfs(TreeNode node, int parent, int depth, int x, int y) {
        if (node == null) return;

        if (node.val == x) {
            xParent = parent;
            xDepth = depth;
        }

        if (node.val == y) {
            yParent = parent;
            yDepth = depth;
        }

        dfs(node.left, node.val, depth + 1, x, y);
        dfs(node.right, node.val, depth + 1, x, y);
    }
}
