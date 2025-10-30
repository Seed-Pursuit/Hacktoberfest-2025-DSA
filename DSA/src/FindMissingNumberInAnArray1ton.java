public class FindMissingNumberInAnArray1ton {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array (missing 3)
        int n = 6; // Total numbers expected (1 to 6)

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing number: " + missingNumber);
    }
}