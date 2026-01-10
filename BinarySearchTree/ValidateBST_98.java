import java.util.ArrayList;

// 98. Validate BST

//  Given the root of a binary tree, determine if it is a valid binary search tree (BST).
// A valid BST is defined as follows:
// The left subtree of a node contains only nodes with keys strictly less than the node's key.
// The right subtree of a node contains only nodes with keys strictly greater than the node's key.
// Both the left and right subtrees must also be binary search trees.


public class ValidateBST_98 {
      void inorder(TreeNode root, ArrayList<Integer> ans){
        if(root==null) return;
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
    }


    public boolean isValidBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        for(int i=1;i<arr.size();i++){
            if(arr.get(i)<=arr.get(i-1)) return false;
        }
        return true;
    }
}
