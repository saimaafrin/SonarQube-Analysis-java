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
    if (mat == null || mat.length == 0 || mat[0].length == 0) {
      return new int[]{};
    }

    int rows = mat.length;
    int cols = mat[0].length;
    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 0; i < rows + cols - 1; i++) {
      if (i % 2 == 0) {
        // Traverse up
        for (int r = Math.min(i, rows - 1); r >= 0 && i - r < cols; r--) {
          result.add(mat[r][i - r]);
        }
      } else {
        // Traverse down
        for (int c = Math.min(i, cols - 1); c >= 0 && i - c < rows; c--) {
          result.add(mat[i - c][c]);
        }
      }
    }

    return result.stream().mapToInt(Integer::intValue).toArray();
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