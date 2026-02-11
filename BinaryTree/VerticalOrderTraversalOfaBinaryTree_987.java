import java.util.*;

// 987. VerticalTraversalOfaBinaryTree

// Given the root of a binary tree, calculate the vertical order traversal of the binary tree.
// For each node at position (row, col), its left and right children will be at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).
// The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row and same column. In such a case, sort these nodes by their values.
// Return the vertical order traversal of the binary tree.

 

class Pair {
    TreeNode node;
    int col;
    int row;

    Pair(TreeNode node, int col, int row) {
        this.node = node;
        this.col = col;
        this.row = row;
    }
}

class VerticalTraversalOfaBinaryTree_987 {
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        // col -> row -> sorted values
     TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new   TreeMap<>();

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0, 0));

        // BFS traversal
        while (!q.isEmpty()) {
            Pair p = q.poll();
            TreeNode node = p.node;
            int col = p.col;
            int row = p.row;

            map
                .computeIfAbsent(col, k -> new TreeMap<>())
                .computeIfAbsent(row, k -> new PriorityQueue<>())
                .add(node.val);

            if (node.left != null)
                q.add(new Pair(node.left, col - 1, row + 1));

            if (node.right != null)
                q.add(new Pair(node.right, col + 1, row + 1));
        }

        // Build answer
        List<List<Integer>> ans = new ArrayList<>();

        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> colList = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    colList.add(pq.poll());
                }
            }
            ans.add(colList);
        }

        return ans;
    }
}