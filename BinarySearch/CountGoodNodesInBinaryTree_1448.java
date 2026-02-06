// 1448. Count Good Nodes In Binary Tree

// Given a binary tree root, a node X in the tree is named good if in the path from root to X there are no nodes with a value greater than X.
// Return the number of good nodes in the binary tree.

class CountGoodNodesInBinaryTree_1448{

    // DFS traversal that carries the maximum value seen so far
    private int dfs(TreeNode node, int maxSoFar) {

        if (node == null) return 0;

        int goodCount = 0;

        // Check if current node is a good node
        if (node.val >= maxSoFar) {
            maxSoFar = node.val;
            goodCount++;
        }

        // Continue DFS on left and right subtrees
        return goodCount
             + dfs(node.left, maxSoFar)
             + dfs(node.right, maxSoFar);
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
}