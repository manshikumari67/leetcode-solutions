
// 897.Increasing Order Search Tree

// Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

class IncreasingOrderSearchTree_897 {
    public static void inorder(ArrayList<TreeNode>ans,TreeNode root){
        if(root==null){
            return;
        }
        inorder(ans,root.left);
        ans.add(root);
        inorder(ans,root.right);
    }
    public static TreeNode tree(ArrayList<TreeNode>ans,int i){
        if(i==ans.size()){
            return null;
        }
        TreeNode root=ans.get(i);
        root.left=null;
        root.right=tree(ans,i+1);
        return root;
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<TreeNode>ans=new ArrayList<>();
        inorder(ans,root);
        return tree(ans,0);
    }
}