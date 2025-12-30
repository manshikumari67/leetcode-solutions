import java.util.ArrayList;

public class TreeBoundaryTraversal {
    ArrayList<Integer> boundaryTraversal(TreeNode root){
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(root.val);
        if(root.left==null && root.right==null) return ans;
        leftBoundary(root.left,ans);
        leafNodes(root,ans);
        rightBoundary(root.right,ans);
        return ans;
    }

    private void leftBoundary(TreeNode root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        ans.add(root.val);
        if(root.left!=null) leftBoundary(root.left, ans);
        else leftBoundary(root.right, ans);
    }

    private void leafNodes(TreeNode root, ArrayList<Integer> ans) {
       if(root==null) return;
       if(root.left==null && root.right==null) ans.add(root.val);
       leafNodes(root.left, ans);
       leafNodes(root.right, ans);
    }

    private void rightBoundary(TreeNode root, ArrayList<Integer> ans) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        if(root.right!=null) rightBoundary(root.right, ans);
        else rightBoundary(root.left, ans);
        ans.add(root.val);
    }

    
}
