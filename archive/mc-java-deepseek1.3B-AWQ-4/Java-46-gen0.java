import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Problem {

  /**
   * Given an integer n, return all the center symmetric numbers of length n.
   *
   * @param n The length of the center symmetric numbers.
   * @return A list of center symmetric numbers.
   *
   * Example:
   * centerSymmetricNumbers(2)
   * Output: ["11","69","88","96"]
   *
   * centerSymmetricNumbers(1)
   * Output: ["0","1","8"]
   */
  public static List<String> centerSymmetricNumbers(int n)  {

    List<String> result = new ArrayList<>();
    int lowerBound = 10^(n-1);
    int upperBound = 10^n;

    for(int num=lowerBound; num<upperBound; num++){
      String strNum = String.valueOf(num);
      int leftIndex = 0;
      int rightIndex = strNum.length() - 1;
      boolean isSymmetric = true;

      while (leftIndex < rightIndex){
        if (strNum.charAt(leftIndex) != strNum.charAt(rightIndex)){
          isSymmetric = false;
          break;
        }
        leftIndex++;
        rightIndex--;
      }

      if (isSymmetric){
        result.add(strNum);
      }
    }

    return result;
  }
  private static void assertArrays(String[] expected, List<String> actual) {
    if (actual == null || actual.size() != expected.length) {
      throw new AssertionError("Test case failed");
    }
    for (String str : expected) {
      if (!actual.contains(str)) {
        throw new AssertionError("Test case failed");
      }
    }
  }

  public static void main(String[] args) {
    assertArrays(
      new String[] { "11", "69", "88", "96" },
      centerSymmetricNumbers(2)
    );
    assertArrays(new String[] { "0", "1", "8" }, centerSymmetricNumbers(1));
    assertArrays(
      new String[] {
        "101",
        "111",
        "181",
        "609",
        "619",
        "689",
        "808",
        "818",
        "888",
        "906",
        "916",
        "986",
      },
      centerSymmetricNumbers(3)
    );
    System.out.println("All tests passed");
  }
}
