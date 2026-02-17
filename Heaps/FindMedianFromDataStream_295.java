package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

// 295. Find Median from Data Stream

// The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.
// For example, for arr = [2,3,4], the median is 3.
// For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.

public class FindMedianFromDataStream_295 {
     PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    
    public void addNum(int num) {
            if (maxHeap.size() == 0)
            maxHeap.add(num);
        else {
            if (num < maxHeap.peek())
                maxHeap.add(num);
            else
                minHeap.add(num);
        }

        // balance heaps
        if (maxHeap.size() == minHeap.size() + 2)
            minHeap.add(maxHeap.remove());

        if (minHeap.size() == maxHeap.size() + 2)
            maxHeap.add(minHeap.remove());
    }
    
    public double findMedian() {
         if (maxHeap.size() == minHeap.size() + 1)
            return maxHeap.peek();

        else if (minHeap.size() == maxHeap.size() + 1)
            return minHeap.peek();

        else
            return (maxHeap.peek() + minHeap.peek()) / 2.0;
    }
}
