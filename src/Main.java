import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }

        }
        System.out.println("======================================");
        SortedSet<Integer> sortedSet = new TreeSet<Integer>();
        sortedSet.addAll(nums);
        for (Integer num : sortedSet) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("======================================");
        List<String> words = new ArrayList<>(List.of("один", "два", "три", "два", "один", "четыре"));
        List<String> uni = new ArrayList<String>();
        for (String word : words) {
            if (!uni.contains(word)) {
                uni.add(word);
            }
        }
        System.out.println(uni);
        System.out.println("======================================");
        List<String> words2 = new ArrayList<>(List.of("один", "два", "один", "два", "один", "четыре"));
        List<String> dubli2 = new ArrayList<String>();
        int dubli = 0;
        for (int i = 0; i < words2.size(); i++) {
            boolean find = false;
            for (int j = i + 1; j < words2.size(); j++) {
                if (words2.get(i).equals(words2.get(j))) {
                    dubli2.add(words2.get(j));
                    words2.remove(j);
                    j--;
                    dubli++;
                    find = true;
                }
            }
            if (find) {
                dubli2.add(words2.get(i));
                words2.remove(i);
                i--;
                dubli++;
            }
        }
        System.out.println(dubli);
        System.out.println(dubli2);
        System.out.println(words2);
    }
}