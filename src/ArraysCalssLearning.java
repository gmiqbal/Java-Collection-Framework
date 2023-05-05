import java.util.Arrays;

public class ArraysCalssLearning {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(numbers, 4);
        System.out.println("The index of element 4 in the array is: " + index);

        int[] otherNumbers = {10,13,2,54,23,232};
        Arrays.sort(otherNumbers);
        for (int number: otherNumbers){
            System.out.print(number + " ");
        }

        System.out.println();
        Arrays.fill(otherNumbers, 1611019);
        for (int number: otherNumbers){
            System.out.print(number + " ");
        }
    }
}
