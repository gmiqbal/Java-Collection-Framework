import java.util.HashSet;
import java.util.Set;

public class SetLearning {
    public static void main(String[] args) {
        /**
         * Duplicate elements are not allowed in Sets
         * no defined order is maintained
         * think of it like a bag that don't have any order inside but won't take same thing twice
         */

        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(5);
        set.add(5);
        set.add(5);
        /*
        it will only take one '5' and ignore others
         */
        set.add(15);
        set.add(25);
        set.add(53);
        set.add(54);

        System.out.println(set);

        set.remove(5);
        System.out.println(set);
        System.out.println(set.contains(25));
        System.out.println(set.contains(10));
        System.out.println(set.contains(25));
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);



    }
}
