import java.util.Arrays;

// 1008. Construct Binary Search Tree from PreOrder Traversal

// Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
// It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
// A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
// A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.


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

public class ConstructBSTfromPreOrder_1008 {
     public TreeNode bstFromPreorder(int[] preorder) {
        int[] inorder=Arrays.copyOf(preorder,preorder.length);
        Arrays.sort(inorder);
        int n =inorder.length;
        return build(0,n-1,0,n-1,inorder,preorder);
    }
    public static TreeNode build(int preLo,int preHi,int inLo,int inHi,int[] inorder,int[] preorder){
        if(preLo>preHi ||inLo > inHi) return null;
        int val=preorder[preLo];
        TreeNode root=new TreeNode(val);
        int r=-1;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-inLo;
        root.left=build(preLo+1, preLo+cnt , inLo,r-1, inorder,preorder);
        root.right=build(preLo+cnt+1, preHi ,r+1,inHi, inorder,preorder);
        return root;
    }
}
