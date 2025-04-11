import java.util.HashMap;
public class FrequencyCounter {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 2, 1, 4, 5, 1, 2, 3, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        // Counting frequency of each element
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Printing frequency of each element
        System.out.println("Frequency of each element in the array:");
        for (int key : frequencyMap.keySet()) {
            System.out.println("Element: " + key + " - Count: " + frequencyMap.get(key));
        }
    }
}
