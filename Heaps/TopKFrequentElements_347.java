package Heaps;

import java.util.HashMap;
import java.util.PriorityQueue;

class Pair implements Comparable<Pair>{

    int ele;
    int freq;

    Pair(int ele,int freq){
        this.ele = ele;
        this.freq = freq;
    }

    public int compareTo(Pair p){

        return this.freq - p.freq;
    }
}

public class TopKFrequentElements_347 {
     public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int ele : nums)
            map.put(ele,map.getOrDefault(ele,0)+1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int ele : map.keySet()){

            pq.add(new Pair(ele,map.get(ele)));

            if(pq.size()>k)
                pq.remove();
        }

        int[] ans = new int[k];

        for(int i=k-1;i>=0;i--){

            ans[i] = pq.remove().ele;
        }

        return ans;
    }
}
