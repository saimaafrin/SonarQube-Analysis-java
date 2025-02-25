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

        // WRITE CODE HERE
        // The problem is to identify the different bracketing groups of the string
        // We need to parse the input string, and identify the starting and ending bracket positions
        // We can do this by iterating over the string, keeping track of the current bracket depth and starting/ending positions
        // As we find a bracket, we can check to see if it's the first bracket of a group or the last bracket of a group
        // If it's the first bracket, we store the starting position, and if it's the last bracket, we store the ending position
        // When we've reached the end of the string, we add the group to a list and return it

        // First, we can initialise the depth, start and end positions, and the list of groups
        int depth = 0;
        int start = 0;
        int end = 0;
        ArrayList<String> groups = new ArrayList<String>();

        // Next, we iterate over the string
        for (int i = 0; i < paren_string.length(); i++) {
            // For each character, we check to see if it's a bracket
            // If it is, we increment the depth, as we've entered another bracket
            if (paren_string.charAt(i) == '(') {
                depth++;
            }
            // If it's a closing bracket, we decrement the depth, as we've exited a bracket
            else if (paren_string.charAt(i) == ')') {
                depth--;
            }
            // If we've just left a bracket, we've reached the end of a group
            // We can use the depth to check if it's the start or end of a group, and add it to the list
            if (depth == 0 && start != 0) {
                groups.add(paren_string.substring(start, i + 1));
                start = i + 1;
            }
            // If we're on the last character and the depth is 0, we've reached the end of a group
            // We can add it to the list and break
            if (i == paren_string.length() - 1 && depth == 0) {
                groups.add(paren_string.substring(start, i + 1));
                break;
            }
        }
        return groups;
    }
    public static void main(String[] args) {
    assert(separateParenGroups(("(()()) ((())) () ((())()())")).equals((new ArrayList<String>(Arrays.asList((String)"(()())", (String)"((()))", (String)"()", (String)"((())()())")))));
    assert(separateParenGroups(("() (()) ((())) (((())))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"((()))", (String)"(((())))")))));
    assert(separateParenGroups(("(()(())((())))")).equals((new ArrayList<String>(Arrays.asList((String)"(()(())((())))")))));
    assert(separateParenGroups(("( ) (( )) (( )( ))")).equals((new ArrayList<String>(Arrays.asList((String)"()", (String)"(())", (String)"(()())")))));
    }

}
