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
    int maxArea = 0;
    Stack<Integer> stack = new Stack<Integer>();
    for (int i = 0; i <= heights.length; i++) {
      int height = (i == heights.length) ? 0 : heights[i];
      if (stack.isEmpty()) {
        stack.push(height);
      } else {
        int topHeight = stack.peek();
        if (topHeight <= height) {
          stack.push(height);
        } else {
          while (!stack.isEmpty() && stack.peek() <= height) {
            int area = stack.pop() * i;
            maxArea = Math.max(maxArea, area);
          }
          stack.push(height);
        }
      }
    }
    while (!stack.isEmpty()) {
      int area = stack.pop() * (stack.isEmpty() ? heights.length : stack.peek());
      maxArea = Math.max(maxArea, area);
    }
    return maxArea;
  }
  public static void main(String[] args) {
    assert largestRectangleArea(new int[] { 1, 2, 3, 4, 5, 3, 3, 2 }) == 15;
    assert largestRectangleArea(new int[] { 6, 2, 5, 4, 5, 1, 6 }) == 12;
    assert largestRectangleArea(new int[] { 2, 1, 2, 3, 1 }) == 5;

    System.out.println("All tests passed");
  }
}