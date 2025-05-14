class Problem {

  /**
   * Determine if the given points form a boomerang on the X-Y plane.
   *
   * @param points An array of points where points[i] = [xi, yi].
   * @return True if the points form a boomerang, false otherwise.
   *
   * Example:
   * isBoomerang(new int[][]{{1,1},{2,3},{3,2}})
   * Output: true
   */
  public static boolean isBoomerang(int[][] points)  {
    int y1 = points[0][1];
    int y2 = points[1][1];
    int y3 = points[2][1];

    int x1 = points[0][0];
    int x2 = points[1][0];
    int x3 = points[2][0];

    // If y2 == y3, then the boomerang is a straight line
    // This case is not considered
    if (y2 == y3) {
      return false;
    }

    // If x2 == x3, then the boomerang is a vertical line
    // This case is not considered
    if (x2 == x3) {
      return false;
    }

    // The boomerang can be made by forming a left turn with the three points
    // If the two points are on the same line, then the boomerang is not possible
    if (((y2-y1)*(y3-y1) < 0) && ((y2-y1)*(x3-x1) < 0)) {
      return true;
    }

    return false;
  }
  public static void main(String[] args) {
    assert isBoomerang(new int[][] { { 0, 0 }, { 2, 2 }, { 1, 1 } }) ==
    false : "Test case 1 failed";
    assert isBoomerang(new int[][] { { 1, 1 }, { 2, 4 }, { 3, 1 } }) ==
    true : "Test case 2 failed";
    assert isBoomerang(new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 } }) ==
    true : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}