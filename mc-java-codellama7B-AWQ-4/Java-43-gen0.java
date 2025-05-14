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

    Stack<Integer> heightsStack = new Stack<Integer>();

    for (int height : heights) {
      if (heightsStack.empty() || height > heightsStack.peek()) {
        heightsStack.push(height);
      } else {
        int width = heightsStack.size();
        int minHeight = heightsStack.peek();
        while (heightsStack.size() > 0 && height <= heightsStack.peek()) {
          heightsStack.pop();
        }

        int currentWidth = heightsStack.size();
        int currentHeight = heightsStack.peek();

        int area = (width - currentWidth) * currentHeight;
        maxArea = Math.max(maxArea, area);

        heightsStack.push(height);
      }
    }

    while (!heightsStack.empty()) {
      int height = heightsStack.pop();
      int width = heightsStack.size();
      int area = (width + 1) * height;
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