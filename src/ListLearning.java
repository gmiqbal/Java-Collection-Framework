import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLearning {
    public static void main(String[] args) {
        /**
         * creating studenId Arraylist that is able to expand unlimitedly as needed
         */

        /**
         * Using List<Integer> makes your code more flexible and easy to change,
         * while using ArrayList<Integer> allows you to use special features of ArrayList
         * but makes it harder to switch to another type of list.
         */
        List<Integer> studentId = new java.util.LinkedList<Integer>();

        /**
         * elements can be added to the arraylist using dot add operator
         */
        studentId.add(1);
        studentId.add(2);
        studentId.add(3);
        studentId.add(4);
        System.out.println(studentId);

        java.util.ArrayList<Integer> moreId = new java.util.ArrayList<Integer>();
        moreId.add(5);
        moreId.add(6);
        moreId.add(8);
        /**
         * elements can be added to specific places using (index,element) params
         */
        moreId.add(2,7);
        System.out.println(moreId);

        /**
         * two arraylist can be merged using dot addAll operator
         */
        studentId.addAll(moreId);
        System.out.println(studentId);

        /**
         * single element can be accessed using dot get operator
         */
        System.out.println(studentId.get(1));

        /**
         * single element can be removed using dot remove operator
         */
        studentId.remove(2);
        System.out.println(studentId);

        /**
         * an element can be replaced with dot set operator giving (index, element) params
         */
        studentId.set(2,3);
        System.out.println(studentId);

        /**
         * elements can be removed by value using Integer.valueOf operator
         */
        studentId.remove(Integer.valueOf(5));
        System.out.println(studentId);

        /**
         * checking whether arraylist contains a specific element
         */
        System.out.println(studentId.contains(8));


        /**
         * printing each element of the arraylist using three methods.
         * For each is recommended for it's simplicity.
         */
        for (int i = 0; i < studentId.size(); i++) {
            System.out.println("the element is: " + studentId.get(i));
        }

        for (Integer element: studentId) {
            System.out.println("for each element is: " + element);
        }

        Iterator<Integer> it = studentId.iterator();
        while (it.hasNext()){
            System.out.println("Iterator :" + it.next());
        }

        /**
         * the whole list can be cleared
         */
        studentId.clear();
        System.out.println(studentId);
    }
}