
// 450. Delete Node In BST

// Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
// Basically, the deletion can be divided into two stages:
// Search for a node to remove.
// If the node is found, delete the node.
 

public class DeleteNodeInBST_450 {
     public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null) return null;
        if(root.val>key){
            root.left=deleteNode(root.left,key);
        }
        else if(root.val<key){
            root.right=deleteNode(root.right,key);
        }
        else{
            // case1 : (leaf Node)
            if(root.left==null && root.right==null) return null;
            // case2 : (1 child Node)
            if(root.left==null) return root.right;
            if(root.right==null) return root.left;
            // Case3 : (2 child Node)
            TreeNode pred=root.left;
            while(pred.right!=null) pred=pred.right;
            root.left=deleteNode(root.left,pred.val);
            pred.left=root.left;
            pred.right=root.right;
            return pred;
        }

        return root;
    }
}
