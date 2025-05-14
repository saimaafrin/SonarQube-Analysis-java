class Problem {
    /**
    * Given a string s composed of '(' and ')', the left and right brackets in s may be unbalanced. Each operation can insert a '(' or ')', and calculate the minimum number of insertion operations required. Make the left and right brackets in s balanced.
    *
    * Example 1:
    * Input: s = "(()))"
    * Output: 1
    * Explanation:  We need to add one '(' at the first of the string to make it balanced: "((()))".
    * Example 2:
    * Input: s = "((()))"
    * Output: 0
    *
    * - s consists of '(' and ')' only.
    */
 public int minInsertions(String s)  {
    if(s == null || s.length() == 0)
        return 0;
        
    int count = 0, index = 0;
    char[] arr = s.toCharArray();
    for(char c : arr){
        if(c == '('){
            if(index % 2 != 0) { // this means there is a closing bracket without a pair
                count++;
            }
            index++;
        } else {
            index++;
            if(index % 2 != 0) { // this means there is a opening bracket without a pair
                count++;
           
            }
       
        }
    }
    return count;
}
    public static void main(String[] args) {
        Problem solution = new Problem();

        // Test the function with different test cases
        assert solution.minInsertions("((()))") == 0;
        assert solution.minInsertions("()()()") == 0;
        assert solution.minInsertions("(()))(()") == 2;
        assert solution.minInsertions("))())(((") == 6;
        System.out.println("All tests passed");
    }
}