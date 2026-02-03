// Most Frequent Sub TreeSum

// Given the root of a binary tree, return the most frequent subtree sum. If there is a tie, return all the values with the highest frequency in any order.
// The subtree sum of a node is defined as the sum of all the node values formed by the subtree rooted at that node (including the node itself).

 
class MostFrequentSubTreeSum_508 {
    int maxF=0;
    List<Integer> maxSumArr = new ArrayList<>();
    Map<Integer, Integer> f = new HashMap<>();

    public int[] findFrequentTreeSum(TreeNode root) {
        solve(root);

        int[] arr = new int[maxSumArr.size()];
        for(int i=0; i<arr.length; i++){
            arr[i] = maxSumArr.get(i);
        }
        return arr;
    }

    public int solve(TreeNode root){
        if(root == null) return 0;
        
        int sum = root.val + solve(root.left) + solve(root.right);
        f.put(sum , f.getOrDefault(sum, 0) + 1);
        
        if(f.get(sum) > maxF){
            maxSumArr.clear();
            maxSumArr.add(sum);
            maxF = f.get(sum);
        }else if(f.get(sum) == maxF){
            maxSumArr.add(sum);
        }

        return sum;
    }
}