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

        // This function parses the nested parentheses, returning the list of maximum depths for each group.
        // Write your code here
        ArrayList<Long> depths = new ArrayList<Long>();
        ArrayList<Character> parens = new ArrayList<Character>();
        for(char c : paren_string.toCharArray()){
            if(c=='('){
                parens.add(c);
            }
            else if(c==')'){
                if(parens.size()>0){
                    parens.remove(parens.size()-1);
                }
            }
        }
        long max = 0l;
        for(char c:parens){
            max++;
        }
        depths.add(max);
        return depths;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
