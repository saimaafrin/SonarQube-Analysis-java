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

        ArrayList<Long> maxLevels = new ArrayList<Long>();
        String[] parens = paren_string.split(" ");
        for(String paren : parens){
            if(paren.isEmpty())
                maxLevels.add((long)0);
            else{
                char[] chars = paren.toCharArray();
                int maxLevel = 0;
                int level = 0;
                for(char c : chars){
                    if(c == '('){
                        level++;
                        if(level > maxLevel)
                            maxLevel = level;
                    }
                    else if(c == ')')
                        level--;
                }
                maxLevels.add((long)maxLevel);
            }
        }
        return maxLevels;
    }
    public static void main(String[] args) {
    assert(parseNestedParens(("(()()) ((())) () ((())()())")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)3l, (long)1l, (long)3l)))));
    assert(parseNestedParens(("() (()) ((())) (((())))")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)2l, (long)3l, (long)4l)))));
    assert(parseNestedParens(("(()(())((())))")).equals((new ArrayList<Long>(Arrays.asList((long)4l)))));
    }

}
