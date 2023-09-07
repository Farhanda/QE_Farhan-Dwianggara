import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumbers {
    public static void main(String[] args) {
        String input1 = "76523752";
        String input2 = "1122";

        List<Integer> result1 = findUniqueNumbers(input1);
        List<Integer> result2 = findUniqueNumbers(input2);

        System.out.println(result1); // Output: [6, 3]
        System.out.println(result2); // Output: []
    }

    public static List<Integer> findUniqueNumbers(String input) {
        List<Integer> uniqueNumbers = new ArrayList<>();
        Map<Character, Integer> countMap = new HashMap<>();

        // Menghitung jumlah kemunculan setiap karakter dalam input
        for (char digit : input.toCharArray()) {
            countMap.put(digit, countMap.getOrDefault(digit, 0) + 1);
        }

        // Memeriksa setiap karakter dalam input
        for (char digit : input.toCharArray()) {
            if (countMap.get(digit) == 1) {
                uniqueNumbers.add(Character.getNumericValue(digit));
            }
        }

        return uniqueNumbers;
    }
}
