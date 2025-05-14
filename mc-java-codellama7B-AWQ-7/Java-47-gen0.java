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
    if (points.length != 3) return false;
    int[] xVals = new int[]{points[0][0], points[1][0], points[2][0]};
    int[] yVals = new int[]{points[0][1], points[1][1], points[2][1]};
    if (xVals[0] == xVals[1] || xVals[0] == xVals[2] || xVals[1] == xVals[2] ||
        yVals[0] == yVals[1] || yVals[0] == yVals[2] || yVals[1] == yVals[2])
      return false;
    if (xVals[0] > xVals[1] || xVals[1] > xVals[2]) return false;
    if (yVals[0] > yVals[1] || yVals[1] > yVals[2]) return false;
    return (xVals[1] - xVals[0]) * (yVals[2] - yVals[1]) < (xVals[2] - xVals[1]) * (yVals[1] - yVals[0]);
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