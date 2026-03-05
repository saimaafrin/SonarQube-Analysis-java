import java.util.HashSet;
import java.util.Set;

class Problem {

  /**
   * Given a non-negative integer array A, if the sum of each pair of adjacent elements in the array is a perfect square, then the array is considered a square array.
   * Return the number of square permutations of A. Two permutations A1 and A2 are considered different if there exists an index i such that A1[i] != A2[i].
   *
   * @param A The input non-negative integer array.
   * @return The number of square permutations of A.
   *
   * Example:
   * squarePermutations(new int[]{1, 17, 8})
   * Output: 2
   *
   * Example:
   * squarePermutations(new int[]{2, 2, 2})
   * Output: 1
   */
  public static int squarePermutations(int[] A)  {
    // Initialize the set of permutations.
    Set<String> permutations = new HashSet<>();

    // Loop through the array and add the permutations to the set.
    for (int i = 0; i < A.length; i++) {
      // Add the permutation to the set.
      permutations.add(String.format("%d", A[i]));

      // Loop through the remaining elements in the array.
      for (int j = i + 1; j < A.length; j++) {
        // Add the permutation to the set.
        permutations.add(String.format("%d%d", A[i], A[j]));
      }
    }

    // Return the number of permutations in the set.
    return permutations.size();
  }
  public static void main(String[] args) {
    assert squarePermutations(new int[] { 1, 8, 27 }) == 0;
    assert squarePermutations(new int[] { 1, 8, 17 }) == 2;
    assert squarePermutations(new int[] { 4, 1, 3, 0, 2 }) == 0;
    System.out.println("All tests passed");
  }
}