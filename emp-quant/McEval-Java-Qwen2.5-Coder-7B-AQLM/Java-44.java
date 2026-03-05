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
    if (mat == null || mat.length == 0) {
      return new int[0];
    }

    int rows = mat.length;
    int cols = mat[0].length;
    int[] result = new int[rows * cols];
    ArrayList<Integer> temp = new ArrayList<>();

    for (int i = 0; i < rows + cols - 1; i++) {
      temp.clear();
      int r = i < cols ? 0 : i - cols + 1;
      int c = i < cols ? i : cols - 1;

      while (r < rows && c >= 0) {
        temp.add(mat[r][c]);
        r++;
        c--;
      }

      if (i % 2 == 0) {
        Collections.reverse(temp);
      }

      for (int j = 0; j < temp.size(); j++) {
        result[i * cols + j] = temp.get(j);
      }
    }

    return result;
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