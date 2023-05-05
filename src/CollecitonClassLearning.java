import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollecitonClassLearning {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(56);
        list.add(34);
        list.add(34);

        System.out.println("Minimum value: " + Collections.min(list));
        System.out.println("Maximum value: " + Collections.min(list));
        System.out.println("Frequency of 34: " + Collections.frequency(list, 34));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
