

// 671. Second Minimum Node In a Binary Tree

// Given a non-empty special binary tree consisting of nodes with the non-negative value, where each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this node's value is the smaller value among its two sub-nodes. More formally, the property root.val = min(root.left.val, root.right.val) always holds.
// Given such a binary tree, you need to output the second minimum value in the set made of all the nodes' value in the whole tree.
// If no such second minimum value exists, output -1 instead.


public class SecondMinimumNodeInBT_671 {
    public int findSecondMinimumValue(TreeNode root) {
         long[] ans = new long[]{Long.MAX_VALUE};
        dfs(root, root.val, ans);
        return ans[0] == Long.MAX_VALUE ? -1 : (int) ans[0];
    }

    private void dfs(TreeNode node, int min, long[] ans) {
        if (node == null) return;

        if (node.val > min && node.val < ans[0]) {
            ans[0] = node.val;
        }

        dfs(node.left, min, ans);
        dfs(node.right, min, ans);
    }
}
