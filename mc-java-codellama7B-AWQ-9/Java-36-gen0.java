import java.util.ArrayList;
import java.util.List;

class Problem {

  /**
   * Find all stepping numbers in the range [low, high] where a stepping number is defined as a number where each digit is either one more or one less than the adjacent digit.
   *
   * @param low The lower bound of the range.
   * @param high The upper bound of the range.
   * @return A list of stepping numbers within the range [low, high] sorted in ascending order.
   *
   * Example:
   * findSteppingNumbers(0, 21)
   * Output: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21]
   */
  public static List<Integer> findSteppingNumbers(int low, int high)  {
    List<Integer> steppingNumbers = new ArrayList<>();

    // Iterate over each digit in the numbers
    for (int i = low; i <= high; i++) {
      int currentNumber = i;
      int previousNumber = i / 10;

      // Iterate over each digit in the number
      for (int j = 1; j < String.valueOf(i).length(); j++) {
        // Get the current digit and its adjacent digit
        int currentDigit = Integer.parseInt(String.valueOf(i).charAt(j) + "");
        int previousDigit = Integer.parseInt(String.valueOf(previousNumber).charAt(j) + "");

        // If the current digit is greater than or equal to the adjacent digit
        if (currentDigit >= previousDigit) {
          // Check if the previous number is a stepping number
          if (isSteppingNumber(previousNumber)) {
            steppingNumbers.add(previousNumber);
          }

          // Check if the current number is a stepping number
          if (isSteppingNumber(currentNumber)) {
            steppingNumbers.add(currentNumber);
          }

          break;
        }
      }
    }

    return steppingNumbers;
  }
  public static void main(String[] args) {
    assert findSteppingNumbers(0, 21)
      .equals(
        new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 21))
      );
    assert findSteppingNumbers(10, 15).equals(new ArrayList<>(List.of(10, 12)));
    assert findSteppingNumbers(50, 55).equals(List.of(54));

    System.out.println("All tests passed");
  }
}
