import java.util.*;
class Problem {

  /**
   * Given n non-negative integers representing the heights of bars in a bar chart.
   * Each bar has a width of 1 unit. Calculate the largest rectangle area that can be formed in the bar chart.
   *
   * @param heights An array of integers representing the heights of bars.
   * @return The maximum area of the rectangle that can be formed.
   *
   * Example:
   * largestRectangleArea(new int[]{2,1,5,6,2,3})
   * Output: 10
   *
   * Example:
   * largestRectangleArea(new int[]{2,4})
   * Output: 4
   */
  public static int largestRectangleArea(int[] heights)  {
    int area = 0;
    int width = heights.length;
    int[] maxHeight = new int[width];
    int[] minHeight = new int[width];

    Arrays.fill(minHeight, 0);
    Arrays.fill(maxHeight, 0);

    for(int i = 0; i < width; i++) {
      for(int j = i; j < width; j++) {
        int height = heights[j];
        if(height > maxHeight[i]) {
          maxHeight[i] = height;
        }
      }
    }

    for(int i = 0; i < width; i++) {
      for(int j = i; j >= 0; j--) {
        int height = heights[j];
        if(height < minHeight[i]) {
          minHeight[i] = height;
        }
      }
    }

    for(int i = 0; i < width; i++) {
      area = Math.max(area, (maxHeight[i] - minHeight[i]) * 1);
    }

    return area;
  }
  public static void main(String[] args) {
    assert largestRectangleArea(new int[] { 1, 2, 3, 4, 5, 3, 3, 2 }) == 15;
    assert largestRectangleArea(new int[] { 6, 2, 5, 4, 5, 1, 6 }) == 12;
    assert largestRectangleArea(new int[] { 2, 1, 2, 3, 1 }) == 5;

    System.out.println("All tests passed");
  }
}