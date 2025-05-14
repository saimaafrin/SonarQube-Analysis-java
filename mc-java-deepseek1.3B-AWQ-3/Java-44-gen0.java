import java.util.ArrayList;

class Problem {

  /**
   * Return all elements in the matrix in diagonal order.
   *
   * @param mat The input matrix.
   * @return An array containing all elements in diagonal order.
   *
   * Example:
   * diagonalOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}})
   * Output: [1,2,4,7,5,3,6,8,9]
   */
  public static int[] diagonalOrder(int[][] mat)  {
    if (mat.length == 0) return new int[0];
    int m = mat.length;
    int n = mat[0].length;
    int size = m * n;
    int[] res = new int[size];
    int resIndex = 0;

    for (int k = 0; k < m + n - 1; k++) {
      if (k % 2 == 0) { // row-wise traversal
        for (int l = 0; l <= k; l++) {
          res[resIndex++] = mat[k - l][l];
        }
      } else { // column-wise traversal
        for (int l = Math.max(0, k - m + 1); l < k + 1; l++) {
          res[resIndex++] = mat[l][k - l];
        }
      }
    }

    return res;
  }
  public static void main(String[] args) {
    assert java.util.Arrays.equals(
      diagonalOrder(new int[][] { { 1, 2 }, { 3, 4 } }),
      new int[] { 1, 2, 3, 4 }
    );
    assert java.util.Arrays.equals(
      diagonalOrder(
        new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }
      ),
      new int[] { 1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12 }
    );
    assert java.util.Arrays.equals(
      diagonalOrder(new int[][] { { 1 }, { 2 }, { 3 } }),
      new int[] { 1, 2, 3 }
    );

    System.out.println("All tests passed");
  }
}