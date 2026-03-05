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
    int n = A.length;
    if (n == 0) {
      return 0;
    }

    // Create a set to store the squares of numbers up to the maximum possible sum of two elements in A
    Set<Integer> squares = new HashSet<>();
    int maxSum = 0;
    for (int i = 1; i * i <= 2 * A[n - 1]; i++) {
      squares.add(i * i);
      maxSum = i * i;
    }

    // Initialize the dynamic programming table
    int[][] dp = new int[n][1 << n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < (1 << n); j++) {
        dp[i][j] = -1;
      }
    }

    // Define a recursive function to calculate the number of square permutations
    int countSquarePermutations(int index, int mask) {
      if (index == n) {
        return 1;
      }
      if (dp[index][mask] != -1) {
        return dp[index][mask];
      }

      int result = 0;
      for (int i = 0; i < n; i++) {
        if ((mask & (1 << i)) == 0 && squares.contains(A[index] + A[i])) {
          result += countSquarePermutations(index + 1, mask | (1 << i));
        }
      }
      dp[index][mask] = result;
      return result;
    }

    // Start the recursive function from the first element
    return countSquarePermutations(0, 0);
  }
  public static void main(String[] args) {
    assert squarePermutations(new int[] { 1, 8, 27 }) == 0;
    assert squarePermutations(new int[] { 1, 8, 17 }) == 2;
    assert squarePermutations(new int[] { 4, 1, 3, 0, 2 }) == 0;
    System.out.println("All tests passed");
  }
}