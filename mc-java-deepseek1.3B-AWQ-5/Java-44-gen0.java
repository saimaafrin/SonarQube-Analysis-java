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
    ArrayList<Integer> res = new ArrayList<>();
    if (mat == null || mat.length == 0) return res.toArray();
    int m = mat.length, n = mat[0].length;
    int size = m * n;
    res.ensureCapacity(size);
    int row = 0, col = 0;
    for (int i = 0; i < size; i++) {
      res.add(mat[row][col]);
      if ((row + col) % 2 == 0) {
        if (col == n - 1) row++;
        else if (row == 0) col++;
        else {
          row--;
          col++;
       
        }
      } else {
        if (row == m - 1) col++;
        else if (col == 0) row++;
        else {
          row++;
          col--;
        }
     
      }
    }
    return res.toArray(new int[0]);
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