import java.util.*;

class Problem {
   /**
     * Given a list of numbers, determine how many items in the list are twice some other item in the same list.
     * 
     * Example:
     * >>> countDoubles(new int[] {1, 4, 3, 2, 9, 7, 18, 22})
     * 3
     * >>> countDoubles(new int[] {2, 4, 8, 10})
     * 2
     * >>> countDoubles(new int[] {7, 5, 11, 13, 1, 3})
     * 0
     */
    public static int countDoubles(int[] numbers)  {
        Arrays.sort(numbers);
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int target = numbers[i] * 2;
            int index = Arrays.binarySearch(numbers, target);
            if (index >= 0 && index != i) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        // Test the function with different test cases
        assert countDoubles(new int[]{1, 2, 4, 8, 16}) == 4;
        assert countDoubles(new int[]{5, 10, 20, 40, 80}) == 4;
        assert countDoubles(new int[]{3, 6, 12, 24, 48}) == 4;
        System.out.println("All tests passed");
    }
}