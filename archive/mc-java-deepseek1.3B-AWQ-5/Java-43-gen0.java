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

    if (heights == null || heights.length == 0) {
      return 0;
    }

    int maxArea = 0;
    int left = 0, right = 0;
    int minHeight = 0;

    Stack<Integer> stack = new Stack<>();

    for (right = 0; right < heights.length; right++) {

      // If this bar is not the first bar we're looking at,
      // then there could be a higher bar at the start of this bar
      if (stack.isEmpty() || heights[stack.peek()] < heights[right]) {
        stack.push(right);
      } else {
        while (!stack.isEmpty() && heights[stack.peek()] >= heights[right]) {
          int mid = stack.pop();
          // If the stack is not empty, means we have a higher bar at the start
          // of the current bar. So, calculate the area
          if (!stack.isEmpty()) {
            minHeight = Math.min(heights[mid], heights[stack.peek()]);
          } else {
            minHeight = heights[mid];
         
          }
          maxArea = Math.max(maxArea, minHeight * (right - stack.peek() - 1));
        }
        stack.push(right);
      }
    }

    // If there are any remaining bars in the stack, calculate the area
    while (!stack.isEmpty()) {
      int mid = stack.pop();
      if (!stack.isEmpty()) {
        minHeight = Math.min(heights[mid], heights[stack.peek()]);
      } else {
        minHeight = heights[mid];
      }
      maxArea = Math.max(maxArea, minHeight * (right - stack.peek() - 1));
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