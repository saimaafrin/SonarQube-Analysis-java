import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Return the number of times the digit 7 appears in integers less than n which are divisible by 11 or 13.
    // >>> fizzBuzz((50l))
    // (0l)
    // >>> fizzBuzz((78l))
    // (2l)
    // >>> fizzBuzz((79l))
    // (3l)
    public static long fizzBuzz(long n) {

        // Get the numbers less than n divisible by 11
        List<Long> divisibleBy11 = IntStream.rangeClosed(0, (int) n - 1)
                                             .filter(i -> i % 11 == 0)
                                             .mapToLong(i -> i + 1)
                                             .boxed()
                                             .collect(Collectors.toList());

        // Get the numbers less than n divisible by 13
        List<Long> divisibleBy13 = IntStream.rangeClosed(0, (int) n - 1)
                                             .filter(i -> i % 13 == 0)
                                            .mapToLong(i -> i + 1)
                                             .boxed()
                                             .collect(Collectors.toList());

        // Flatten the lists and count the occurrences of 7
        long count = divisibleBy11.stream()
                                  .flatMap(i -> Stream.of(i))
                                  .count();

        // Add the number of 7s in the divisible by 13 list
        count += divisibleBy13.stream()
                               .flatMap(i -> Stream.of(i))
                               .filter(i -> i.toString().contains("7"))
                               .count();

        return count;
    }
    public static void main(String[] args) {
    assert(fizzBuzz((50l)) == (0l));
    assert(fizzBuzz((78l)) == (2l));
    assert(fizzBuzz((79l)) == (3l));
    assert(fizzBuzz((100l)) == (3l));
    assert(fizzBuzz((200l)) == (6l));
    assert(fizzBuzz((4000l)) == (192l));
    assert(fizzBuzz((10000l)) == (639l));
    assert(fizzBuzz((100000l)) == (8026l));
    }

}
