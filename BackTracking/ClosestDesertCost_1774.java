package BackTracking;

// 1774. Closest Dessert Cost

// You would like to make a dessert and are preparing to add toppings to it. You have n ice cream base flavors and m types of toppings. You want to make a dessert with a cost as close as possible to target. You can only have one type of ice cream base, but you can add one or more types of toppings or have no toppings at all.

public class ClosestDesertCost_1774 {
      /** Closest cost result */
    int closestCost = Integer.MAX_VALUE;
    /** Difference between closest cost result and target so far */
    int closestCostDiff = Integer.MAX_VALUE;

    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        for (int base : baseCosts) {
            dfs(toppingCosts, 0, base, target);
        }
        return closestCost;
    }

    public void dfs(int[] toppingCosts, int toppingIndex, int cost, int target) {
        int costDiff = Math.abs(target - cost);
        if (costDiff < closestCostDiff || (costDiff == closestCostDiff && cost < closestCost)) {
            closestCostDiff = costDiff;
            closestCost = cost;
        }
        
        // Since toppings are all positive cost, stop dfs early if cost exceeds target
        if (toppingIndex >= toppingCosts.length || cost > target)
            return;

        dfs(toppingCosts, toppingIndex + 1, cost, target);
        dfs(toppingCosts, toppingIndex + 1, cost + toppingCosts[toppingIndex], target);
        dfs(toppingCosts, toppingIndex + 1, cost + 2 * toppingCosts[toppingIndex], target);
    }
}
