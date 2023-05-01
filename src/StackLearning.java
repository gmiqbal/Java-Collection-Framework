import java.util.Stack;

public class StackLearning {
    public static void main(String[] args) {
        /**
         * A Java Stack is a linear data structure that follows the Last-In-First-Out (LIFO) order
         */
        Stack<String> animals = new Stack<>();

        /**
         * Push: This operation adds an element to the top of the stack.
         */
        animals.push("Lion");
        animals.push("Cow");
        animals.push("Cat");
        animals.push("Crow");
        animals.push("Goru");
        animals.push("Haati");
        System.out.println(animals);

        for (String animal: animals) {
            System.out.println("The animal is :" + animal);
        }

        /**
         *peek(): Returns the top element of the stack without removing it.
         */
        System.out.println(animals.peek());

        /**
         * Pop: This operation removes the top element from the stack.
         */
        animals.pop();
        System.out.println(animals);

        /**
         * isEmpty(): Checks if the stack is empty or not.
         */
        System.out.println(animals.isEmpty());

        /**
         * size(): Returns the number of elements in the stack.
         */
        System.out.println(animals.size());

        /**
         * search(Object o): Searches for an element in the stack and
         * returns the 1-based position from the top of the stack if it is found, or -1 if it's not found.
         */
        System.out.println(animals.search("Cat"));
    }
}
