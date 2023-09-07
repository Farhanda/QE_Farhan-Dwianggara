import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeArrays {
    public static void main(String[] args) {
        String[] array1 = {"kazuya", "jin", "lee"};
        String[] array2 = {"kazuya", "feng"};

        List<String> result = mergeArrays(array1, array2);

        System.out.println(result);
    }

    public static List<String> mergeArrays(String[] array1, String[] array2) {
        List<String> mergedList = new ArrayList<>();
        Set<String> uniqueNames = new HashSet<>();

        // Tambahkan elemen-elemen dari array1 ke dalam mergedList
        for (String name : array1) {
            if (!uniqueNames.contains(name)) {
                mergedList.add(name);
                uniqueNames.add(name);
            }
        }

        // Tambahkan elemen-elemen dari array2 yang belum ada di mergedList
        for (String name : array2) {
            if (!uniqueNames.contains(name)) {
                mergedList.add(name);
                uniqueNames.add(name);
            }
        }

        return mergedList;
    }
}
