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
    int numOfRows = mat.length;
    int numOfCols = numOfRows > 0 ? mat[0].length : 0;
    ArrayList<Integer> list = new ArrayList<>();

    // Loop through each row and column, adding element to list.
    for (int i = 0; i < Math.max(numOfRows, numOfCols); i++) {
      if (i < numOfRows) {
        for (int j = 0; j <= i; j++) {
          list.add(mat[i][j]);
        }
      }
      if (i < numOfCols) {
        for (int j = i + 1; j < numOfCols; j++) {
          list.add(mat[j][i]);
        }
      }
    }

    // Convert list to array.
    int[] arr = new int[list.size()];
    for (int i = 0; i < list.size(); i++) {
      arr[i] = list.get(i);
    }

    return arr;
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