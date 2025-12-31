
// 106. Construct Binary Tree from PostOrder And InOrder

// Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree and postorder is the postorder traversal of the same tree, construct and return the binary tree.

public class ConstructBTFromInAndPost_106 {
      public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n =inorder.length;
       return build(0,n-1,0,n-1,inorder,postorder);
    }
    public static TreeNode build(int postLo,int postHi,int inLo,int inHi,int[] inorder,int[] postorder){
        if(postLo>postHi ||inLo > inHi) return null;
        int val=postorder[postHi];
        TreeNode root=new TreeNode(val);
        int r=-1;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int cnt=r-inLo;
       root.left  = build(postLo, postLo + cnt - 1, inLo, r - 1, inorder, postorder);
       root.right = build(postLo + cnt, postHi - 1, r + 1, inHi, inorder, postorder);
        return root;
    }
}
