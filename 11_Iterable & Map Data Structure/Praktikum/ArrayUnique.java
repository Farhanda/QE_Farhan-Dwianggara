import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayUnique {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 3, 5, 10, 16};

        int[] result1 = findUniqueElements(array1, array2);
        for (int num : result1) {
            System.out.print(num + " ");
        }
        // Output: 2 4
        System.out.println();

        int[] array3 = {3, 8};
        int[] array4 = {2, 8};

        int[] result2 = findUniqueElements(array3, array4);
        for (int num : result2) {
            System.out.print(num + " ");
        }
        // Output: 3
    }

    public static int[] findUniqueElements(int[] array1, int[] array2) {
        Set<Integer> set2 = new HashSet<>();
        for (int num : array2) {
            set2.add(num);
        }

        List<Integer> uniqueElements = new ArrayList<>();
        for (int num : array1) {
            if (!set2.contains(num)) {
                uniqueElements.add(num);
            }
        }

        int[] result = new int[uniqueElements.size()];
        for (int i = 0; i < uniqueElements.size(); i++) {
            result[i] = uniqueElements.get(i);
        }

        return result;
    }
}
