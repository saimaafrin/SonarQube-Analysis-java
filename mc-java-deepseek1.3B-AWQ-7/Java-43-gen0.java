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
    if (heights.length == 0) {
      return 0;
    }

    int maxArea = 0;
    // Stores the index of the heights array.
    // Using a stack to get the rectangle with smaller bars.
    Stack<Integer> stack = new Stack<>();

    // Add the 0th index to the stack.
    stack.push(0);

    for (int i = 1; i < heights.length; i++) {
      while (!stack.empty() && heights[i] < heights[stack.peek()]) {
        int currHeight = heights[stack.pop()];
        int currWidth = i;
        int area = currHeight * currWidth;

        if (area > maxArea) {
          maxArea = area;
        }

        if (!stack.empty()) {
          currWidth = currWidth - stack.peek() - 1;
        }
     
        stack.push(i);
      }
    }

    while (!stack.empty()) {
      int currHeight = heights[stack.pop()];
      int currWidth = heights.length - stack.peek() - 1;
      int area = currHeight * currWidth;

      if (area > maxArea) {
        maxArea = area;
      }
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