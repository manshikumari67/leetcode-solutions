import java.util.*;


public class TreeNode {
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

class BinaryTreeInorderTraversal{
   private static void inOrder(TreeNode node, List<Integer> ans) { 
        if (node == null) {
            return;
        }

        inOrder(node.left, ans);
        ans.add(node.val);
        inOrder(node.right, ans);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> ans = new ArrayList<>();

        inOrder(root, ans);

        return ans;      
    }
}