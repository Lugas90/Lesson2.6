import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 6, 22, 8, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> oddNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            if (a % 2 != 0) {
                oddNums.add(a);
            }
        }
        System.out.println(oddNums);

        Set<Integer> evenInOrderNums = new TreeSet<>();
        for (int i = 0; i < nums.size(); i++) {
            int a = nums.get(i);
            if (a % 2 == 0) {
                evenInOrderNums.add(a);

            }
        }
        System.out.println(evenInOrderNums);

        HashSet<String> words = new HashSet<String>(List.of("one", "one",
                "door", "bear", "bear", "bear", "color"));
        System.out.println(words);

        List<String> words2 = new ArrayList<>(List.of("one", "one",
                "door", "bear", "bear", "bear", "color"));

        Map <String, Integer> repeatCount = new HashMap<>();
        for (String string : words2) {
            if (repeatCount.keySet().contains(string)){
                repeatCount.put(string, repeatCount.get(string) +1);
            } else {
                repeatCount.put(string, 1);
            }
        }
        System.out.println(repeatCount);
    }
}