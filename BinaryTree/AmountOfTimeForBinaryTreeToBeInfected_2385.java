import java.util.*;
// Amount Of Time For Binary Tree To Be Infected

// You are given the root of a binary tree with unique values, and an integer start. At minute 0, an infection starts from the node with value start.
// Each minute, a node becomes infected if:
// The node is currently uninfected.
// The node is adjacent to an infected node.
// Return the number of minutes needed for the entire tree to be infected.

class AmountOfTimeForBinaryTreeToBeInfected_2385 {

    class Pair {
        TreeNode node;
        int dist;

        Pair(TreeNode node, int dist) {
            this.node = node;
            this.dist = dist;
        }
    }

    TreeNode startNode = null;
    HashMap<TreeNode, TreeNode> parent = new HashMap<>();

    public int amountOfTime(TreeNode root, int start) {

        // Step 1: parent mapping + target node find
        dfs(root, start);

        // Step 2: BFS from target
        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> burned = new HashSet<>();

        q.add(new Pair(startNode, 0));
        burned.add(startNode);

        int time = 0;

        while (!q.isEmpty()) {
            Pair front = q.poll();
            TreeNode node = front.node;
            int dist = front.dist;

            time = Math.max(time, dist);

            if (node.left != null && !burned.contains(node.left)) {
                q.add(new Pair(node.left, dist + 1));
                burned.add(node.left);
            }

            if (node.right != null && !burned.contains(node.right)) {
                q.add(new Pair(node.right, dist + 1));
                burned.add(node.right);
            }

            if (parent.containsKey(node) && !burned.contains(parent.get(node))) {
                q.add(new Pair(parent.get(node), dist + 1));
                burned.add(parent.get(node));
            }
        }

        return time;
    }

    private void dfs(TreeNode root, int target) {
        if (root == null) return;

        if (root.val == target) startNode = root;

        if (root.left != null) parent.put(root.left, root);
        if (root.right != null) parent.put(root.right, root);

        dfs(root.left, target);
        dfs(root.right, target);
    }
}
