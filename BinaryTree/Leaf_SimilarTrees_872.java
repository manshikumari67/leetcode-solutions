// 872. Leaf Similar Trees

// Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.


class Leaf_SimilarTrees_872{
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        helper(list1, root1);
        helper(list2, root2);

        if(list1.equals(list2))
            return true;
        else
            return false;        
    }
    private void helper(List<Integer>list , TreeNode root)
    {
        if(root == null)
            return;
        if(root.left == null && root.right==null)
        {
            list.add(root.val);
            return;
        }
        else
        {
            helper(list, root.left);
            helper(list, root.right);
        }
    }
}