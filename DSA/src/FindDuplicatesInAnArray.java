import java.util.HashSet;

public class FindDuplicatesInAnArray {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 4, 8, 2, 1, 9, 8};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty()) {
            System.out.println("No duplicates found!");
        } else {
            System.out.println("Duplicate elements: " + duplicates);
        }
    }
}