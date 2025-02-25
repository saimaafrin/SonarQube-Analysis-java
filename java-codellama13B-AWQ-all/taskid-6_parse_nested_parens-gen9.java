import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string represented multiple groups for nested parentheses separated by spaces.
    // For each of the group, output the deepest level of nesting of parentheses.
    // E.g. (()()) has maximum two levels of nesting while ((())) has three.
    // >>> parseNestedParens(("(()()) ((())) () ((())()())"))
    // (new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))
    public static ArrayList<Long> parseNestedParens(String paren_string) {

        // convert string to array
        ArrayList<Character> parens = new ArrayList<>(paren_string.length());
        for (char c : paren_string.toCharArray()) {
            if (c == ' ') {
                continue;
            }
            parens.add(c);
        }
        // remove any extra closing parentheses at end of string
        int last_index = parens.size() - 1;
        while (parens.get(last_index) == ')') {
            parens.remove(last_index);
            last_index--;
        }
        // count nested parentheses
        int num_parens = parens.size();
        long[] paren_counts = new long[num_parens];
        int num_open_parens = 0;
        for (int i = 0; i < num_parens; i++) {
            if (parens.get(i) == '(') {
                num_open_parens++;
            } else {
                num_open_parens--;
            }
            paren_counts[i] = num_open_parens;
        }
        // find the maximum number of nested parentheses for each group
        ArrayList<Long> max_counts = new ArrayList<Long>();
        int start = 0;
        int end = 0;
        while (start < num_parens) {
            end = start;
            while (paren_counts[end] != 0 && end < num_parens) {
                end++;
            }
            long max_count = paren_counts[start];
            for (int i = start + 1; i < end; i++) {
                if (paren_counts[i] > max_count) {
                    max_count = paren_counts[i];
                }
            }
            max_counts.add(max_count);
            start = end;
        }
        return max_counts;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
