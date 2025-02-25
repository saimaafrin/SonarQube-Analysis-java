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

        // Your code here
        // 1. remove all spaces from paren_string
        // 2. find the indices of all '(' and ')'
        // 3. find the first '(' before each ')' and the first ')' before each '('
        // 4. find the depth
        paren_string = paren_string.replaceAll(" ", "");
        ArrayList<Integer> left_indices = new ArrayList<Integer>();
        ArrayList<Integer> right_indices = new ArrayList<Integer>();
        for (int i = 0; i < paren_string.length(); i++) {
            if (paren_string.charAt(i) == '(') left_indices.add(i);
            if (paren_string.charAt(i) == ')') right_indices.add(i);
        }
        int right_idx = -1;
        int left_idx = -1;
        ArrayList<Integer> left_to_right_indices = new ArrayList<Integer>();
        ArrayList<Integer> right_to_left_indices = new ArrayList<Integer>();
        ArrayList<Integer> depths = new ArrayList<Integer>();
        for (int i = 0; i < right_indices.size(); i++) {
            right_idx = right_indices.get(i);
            left_idx = left_indices.get(i);
            left_to_right_indices.add(right_idx - left_idx);
            right_to_left_indices.add(left_idx - right_idx);
            depths.add((right_to_left_indices.get(i) > left_to_right_indices.get(i) ? right_to_left_indices.get(i) : left_to_right_indices.get(i)) / 2);
        }
        return new ArrayList<Long>(depths.stream().map(x -> (long) x).collect(Collectors.toList()));
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
