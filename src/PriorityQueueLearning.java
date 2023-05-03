import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueLearning {
    public static void main(String[] args) {
        /**
         * a special type of data structure in Java, which is part of the Java Collections Framework.
         * It is implemented as a priority queue, meaning that elements are ordered based on their priority.
         */
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
        /**
         * Comparator.reversorder() uses max-heap and peeks/polls highest values first
         */
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        /**
         * By default, the Java PriorityQueue class implements a min-heap,
         * meaning that elements are ordered in ascending order according to their natural order or a custom comparator.
         * The element with the highest priority (i.e., the lowest value) is at the head of the queue
         * and is retrieved first when using the poll() method.
         */
        pq.offer(45);
        pq.offer(12);
        pq.offer(13);
        pq.offer(14);

        System.out.println(pq);

        System.out.println(pq.peek());

        /**
         * poll takes out the highest priority element
         * in this case the least integer value
         * same for peek
         */
        System.out.println(pq.poll());
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

    }
}
