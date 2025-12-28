

// 257. Binary Tree

// Given the root of a binary tree, return all root-to-leaf paths in any order.
// A leaf is a node with no children.

import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
        }
}

public class BinaryTreePaths_257 {
     public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root == null) return ans;
        dfs(root, "", ans);
        return ans;
    }

    private void dfs(TreeNode node, String path, List<String> ans) {
        if (node == null) return;

        // current node ko path me add karo
        path = path + node.val;

        // agar leaf node hai
        if (node.left == null && node.right == null) {
            ans.add(path);
            return;
        }

        // children ke liye arrow add karke call
        dfs(node.left, path + "->", ans);
        dfs(node.right, path + "->", ans);
    }
}
