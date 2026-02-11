
// 701. Insert Into A Binary Tree

// You are given the root node of a binary search tree (BST) and a value to insert into the tree. Return the root node of the BST after the insertion. It is guaranteed that the new value does not exist in the original BST.
// Notice that there may exist multiple valid ways for the insertion, as long as the tree remains a BST after insertion. You can return any of them

public class InsetIntoBST_701 {
     void attach(TreeNode root, int key){
      if(root.val==key) return;
      if(root.val<key){
        if(root.right==null) root.right=new TreeNode(key);
        else attach(root.right,key);
      }
      else{
        if(root.left==null) root.left=new TreeNode(key);
        else attach(root.left,key);
      }
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        attach(root,val);
        return root;
    }
}
