import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Evaluate whether the given number n can be written as the sum of exactly 4 positive even numbers
    // Example
    // >>> isEqualToSumEven((4l))
    // (false)
    // >>> isEqualToSumEven((6l))
    // (false)
    // >>> isEqualToSumEven((8l))
    // (true)
    public static boolean isEqualToSumEven(long n) {

        List<Long> evenNumbers = new ArrayList<>();
        for (long i = 2; i <= n / 2; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            }
        }
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < evenNumbers.size() - 3; i++) {
            indexes.add(i);
        }
        for (Integer index : indexes) {
            for (Integer index2 : indexes) {
                if (index2 != index) {
                    for (Integer index3 : indexes) {
                        if (index3 != index && index3 != index2) {
                            for (Integer index4 : indexes) {
                                if (index4 != index && index4 != index2 && index4 != index3) {
                                    if (evenNumbers.get(index) + evenNumbers.get(index2) + evenNumbers.get(index3) + evenNumbers.get(index4) == n) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
    assert(isEqualToSumEven((4l)) == (false));
    assert(isEqualToSumEven((6l)) == (false));
    assert(isEqualToSumEven((8l)) == (true));
    assert(isEqualToSumEven((10l)) == (true));
    assert(isEqualToSumEven((11l)) == (false));
    assert(isEqualToSumEven((12l)) == (true));
    assert(isEqualToSumEven((13l)) == (false));
    assert(isEqualToSumEven((16l)) == (true));
    }

}
