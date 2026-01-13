class Quad{
    int max;
    int min;
    int sum;
    boolean isBST;
    Quad(int max,int min,int sum ,boolean isBST){
       this.max=max;
       this.min=min;
       this.sum=sum;
       this.isBST=isBST;
    }
}

public class MaximumSumBSTinBST_1373 {
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum=0;
        helper(root);
        return maxSum;
    }
   private Quad helper(TreeNode root) {
        if (root == null)
            return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE, 0, true);

        Quad left = helper(root.left);
        Quad right = helper(root.right);

        int val = root.val;

        // ✅ BST condition
        boolean isBST = left.isBST && right.isBST &&
                        val > left.max && val < right.min;

        if (!isBST) {
            // 🔥 poison non-BST subtree
            return new Quad(
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                0,
                false
            );
        }

        int sum = val + left.sum + right.sum;
        maxSum = Math.max(maxSum, sum);

        int max = Math.max(val, right.max);
        int min = Math.min(val, left.min);   // ✅ FIXED

        return new Quad(max, min, sum, true);
    }
}
