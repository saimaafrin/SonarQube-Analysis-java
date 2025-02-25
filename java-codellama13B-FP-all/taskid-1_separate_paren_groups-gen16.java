import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string containing multiple groups of nested parentheses. Your goal is to
    // separate those group into separate strings and return the array list of those.
    // Separate groups are balanced (each open brace is properly closed) and not nested within each other
    // Ignore any spaces in the input string.
    // >>> separateParenGroups(("( ) (( )) (( )( ))"))
    // (new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))
    public static ArrayList<String> separateParenGroups(String paren_string) {

        // Write your code here
        ArrayList<String> result = new ArrayList<String>();
        if(paren_string.isEmpty()){
            return result;
        }
        int length = paren_string.length();
        for(int start=0;start<length;start++){
            if(paren_string.charAt(start)=='('){
                if(start+1<length && paren_string.charAt(start+1)==')'){
                    result.add("()");
                    start++;
                }else{
                    int count = 1;
                    for(int i=start+1;i<length;i++){
                        if(paren_string.charAt(i)==')'){
                            count--;
                            if(count==0){
                                result.add(paren_string.substring(start,i+1));
                                start=i;
                                break;
                            }
                        }else if(paren_string.charAt(i)=='('){
                            count++;
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
