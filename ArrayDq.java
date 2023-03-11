import java.util.ArrayDeque;
import java.util.Deque;
/**
 * @author nethmeeperera
 * @version 03/03/2023
 * CSC2720 Lab #21093
 * lab time : Wednesday 16:00-16:50
 * due on 03/05/2023
 */
public class ArrayDq {

    public static void main(String[] args) {
	// write your code here
        MaxQueue mxq = new MaxQueue();
        mxq.enqueue(3);
        mxq.enqueue(8);
        mxq.enqueue(2);
        mxq.enqueue(6);
        System.out.println(mxq.getMax()); // 8
        mxq.dequeue();
        System.out.println(mxq.getMax()); // 8
        mxq.dequeue();
        System.out.println(mxq.getMax()); // 6

    }
    public static class MaxQueue {

        //Maintain two Queues
        private Deque<Integer> MaxQueue;
        private Deque<Integer> MainQueue;

        public MaxQueue() {
            //The Main Queue contains the elements.
            MainQueue = new ArrayDeque<>();
            // The Max Queue contains the elements with Maximum value.
            MaxQueue = new ArrayDeque<>();
        }
        public void enqueue(int value) {
            MainQueue.add(value);
            while (!MaxQueue.isEmpty() && MaxQueue.getLast() < value) {
                MaxQueue.removeLast();
            }
            MaxQueue.addLast(value);
        }

        public int dequeue() {
            int x = MainQueue.poll();
            if (x == MaxQueue.peek()) {
                MaxQueue.poll();
            }
            return x;
        }

        public int getMax() {
            return MaxQueue.peek();
        }


    }

}
// Time Complexity of the Max Queue: O(1)
// Space Complexity on the Max Queue : O(4)  n= elements

/*
test cases
1.duplicate elements
2. null input queue
3. single element queue
4. maximum value at front of queue
 */
