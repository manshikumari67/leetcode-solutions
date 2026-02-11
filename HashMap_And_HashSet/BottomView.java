import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
    Node node;
    int dist;

    Pair(Node node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}


public class BottomView {
     static ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null)
            return ans;

        // Map for horizontal distance -> node value
        HashMap<Integer, Integer> map = new HashMap<>();

        // Queue for BFS
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        int minDist = 0;
        int maxDist = 0;

        while (!q.isEmpty()) {

            Pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;

            minDist = Math.min(minDist, dist);
            maxDist = Math.max(maxDist, dist);

            // Store first node at that horizontal distance
            if (!map.containsKey(dist)) {
                map.put(dist, node.data);
            }

            if (node.left != null)
                q.add(new Pair(node.left, dist - 1));

            if (node.right != null)
                q.add(new Pair(node.right, dist + 1));
        }

        // Add results from leftmost to rightmost
        for (int i = minDist; i <= maxDist; i++) {
            ans.add(map.get(i));
        }

        return ans;
    }
}
