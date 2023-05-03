import java.util.LinkedList;
import java.util.Queue;

public class QueueLearning {
    public static void main(String[] args) {
        /**
         * A Queue in Java is a data structure that follows the First-In-First-Out (FIFO) principle,
         * meaning that the element added first to the queue will be removed first.
         */
        Queue<Integer> queue = new LinkedList<>();

        /**
         * dot add throws exception. So better to use offer
         *
         * add(E e): Inserts the specified element into the queue if possible,
         * throwing an IllegalStateException if space is not available.
         * ✅ offer(E e): Inserts the specified element into the queue if possible,
         * returning a boolean value indicating success or failure.
         */
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);

        System.out.println(queue);

        /**
         * remove(): Retrieves and removes the head of the queue,
         * throwing a NoSuchElementException if the queue is empty.
         * ✅ poll(): Retrieves and removes the head of the queue, returning null if the queue is empty.
         */
        System.out.println(queue.poll());
        System.out.println(queue);

        /**
         * element(): Retrieves, but does not remove, the head of the queue,
         * throwing a NoSuchElementException if the queue is empty.
         * peek(): Retrieves, but does not remove, the head of the queue, returning null if the queue is empty.
         *
         * returns which ELEMENT IS NEXT IN LINE to go out
         */
        System.out.println(queue.peek());

    }
}
