import java.util.ArrayDeque;

public class ArrayDequeLearning {
    public static void main(String[] args) {
        /**
         * stands for "Array Double Ended Queue" and
         * is a resizable-array implementation of the Deque (Double Ended Queue) interface.
         * ArrayDeque allows for the efficient addition and removal of elements from both ends (head and tail) of the queue
         */
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(2);
        adq.offer(3);
        adq.offer(4);
        System.out.println(adq);

        adq.offerFirst(1);
        System.out.println(adq);
        adq.offerLast(5);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        adq.poll();
        System.out.println("poll() "+adq);
        adq.pollFirst();
        System.out.println("pollFirst() "+ adq);
        adq.pollLast();
        System.out.println("pollLast() "+adq);

    }
}
