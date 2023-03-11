import java.util.ArrayDeque;
import java.util.Deque;

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

