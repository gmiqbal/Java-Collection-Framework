import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapLearning {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
//        Map<String, Integer> numbers = new TreeMap<>();

        /**
         * keys needs to be unique in here
         */
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        numbers.put("four", 4);
        numbers.putIfAbsent("two", 22);

        numbers.remove("three");
        System.out.println(numbers);


        for(Map.Entry<String, Integer> e:numbers.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: numbers.keySet()){
            System.out.println(key);
        }
        for(Integer value: numbers.values()){
            System.out.println(value);
        }
    }
}
