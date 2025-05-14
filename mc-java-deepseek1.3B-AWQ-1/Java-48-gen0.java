import java.lang.Math;

class Problem {

  /**
   * Find and return the nth ugly number.
   *
   * @param n The index of the ugly number to find.
   * @return The nth ugly number.
   *
   * Example:
   * findNthUglyNumber(10)
   * Output: 12
   */
  public static int findNthUglyNumber(int n)  {
    if (n <= 0) {
      throw new IllegalArgumentException("n must be greater than 0");
    }

    int i2 = 0, i3 = 0, i5 = 0;
    int[] ugly = new int[n];
    ugly[0] = 1;

    int next_ugly = 1;

    while (next_ugly < n) {
      ugly[next_ugly] = Math.min(ugly[i2] * 2, Math.min(ugly[i3] * 3, ugly[i5] * 5));
      
      if (ugly[next_ugly] == ugly[i2] * 2) i2++;
      if (ugly[next_ugly] == ugly[i3] * 3) i3++;
      if (ugly[next
end;
    }

    return ugly[n - 1];
  }
}

public class Main {
  public static void main(String[] args) {
    System.out.println(Problem.findNthUglyNumber(10)); // prints 12
  }
}
```

This Java code finds the nth ugly number by maintaining an array `ugly` to store all the ugly numbers found so far and starting from 1.

At each step, it calculates the next ugly number by taking the minimum of the currently found 2, 3, and 5 multiplied numbers from `ugly`. Then, it increments the correct counter (i2, i3, or i5) to point to the next available number in `ugly`.

This process continues until `ugly` has found the nth ugly number.

Note: The nth ugly number can be very large, so it's not feasible to store it in a variable with a normal integer. Hence, it's considered as an array of integers (`int[] ugly`) in the code.
<|EOT|>
  public static void main(String[] args) {
    assert findNthUglyNumber(1) == 1 : "Test case 1 failed";
    assert findNthUglyNumber(7) == 8 : "Test case 2 failed";
    assert findNthUglyNumber(15) == 24 : "Test case 3 failed";

    System.out.println("All tests passed");
  }
}
