

import java.util.ArrayList;
import java.util.List;


// 145. Binary Tree Postorder Traversal

// Given the root of a binary tree, return the postorder traversal of its nodes' values.


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
    }
}


public class BinaryTreePostorderTraversal_145 {
    private static void postOrder(TreeNode node,List<Integer> ans){
        if(node==null) return ;

        postOrder(node.left,ans);
        postOrder(node.right,ans);
        ans.add(node.val);
    }

    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> ans=new ArrayList<>();

         postOrder(root,ans);

         return ans;
    }
}
