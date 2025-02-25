import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of strings, where each string consists of only digits, return an array array list.
    // Each element i of the output should be "the number of odd elements in the
    // string i of the input." where all the i's should be replaced by the number
    // of odd digits in the i'th string of the input.
    // >>> oddCount((new ArrayList<String>(Arrays.asList((String)"1234567"))))
    // (new ArrayList<String>(Arrays.asList((String)"the number of odd elements 4n the str4ng 4 of the 4nput.")))
    // >>> oddCount((new ArrayList<String>(Arrays.asList((String)"3", (String)"11111111"))))
    // (new ArrayList<String>(Arrays.asList((String)"the number of odd elements 1n the str1ng 1 of the 1nput.", (String)"the number of odd elements 8n the str8ng 8 of the 8nput.")))
    public static ArrayList<String> oddCount(ArrayList<String> lst) {

        // return lst;
        // ArrayList<String> lst = new ArrayList<String>();
        // lst.add("1");
        // lst.add("11111111");
        // System.out.println(lst);
        // System.out.println(lst.get(0));
        // System.out.println(lst.get(1));
        // String test = lst.get(0);
        // System.out.println(test);
        // System.out.println(lst.size());
        // System.out.println(lst.get(0).getClass());
        // System.out.println(lst.get(0).length());
        // System.out.println(lst.get(0).charAt(0));
        // System.out.println(lst.get(0).charAt(1));
        // System.out.println(lst.get(0).charAt(2));
        // System.out.println(lst.get(0).charAt(3));
        // System.out.println(lst.get(0).charAt(4));
        // System.out.println(lst.get(0).charAt(5));
        // System.out.println(lst.get(0).charAt(6));
        // System.out.println(lst.get(0).charAt(7));
        // System.out.println(lst.get(0).charAt(8));
        // System.out.println(lst.get(0).charAt(9));
        // System.out.println(lst.get(0).charAt(10));
        // System.out.println(lst.get(0).charAt(11));
        // System.out.println(lst.get(0).charAt(12));
        // System.out.println(lst.get(0).charAt(13));
        // System.out.println(lst.get(0).charAt(14));
        // System.out.println(lst.get(0).charAt(15));
        // System.out.println(lst.get(0).charAt(16));
        // System.out.println(lst.get(0).charAt(17));
        // System.out.println(lst.get(0).charAt(18));
        // System.out.println(lst.get(0).charAt(19));
        // System.out.println(lst.get(0).charAt(20));
        // System.out.println(lst.get(0).charAt(21));
        // System.out.println(lst.get(0).charAt(22));
        // System.out.println(lst.get(0).charAt(23));
        // System.out.println(lst.get(0).charAt(24));
        // System.out.println(lst.get(0).charAt(25));
        // System.out.println(lst.get(0
    }
    public static void main(String[] args) {
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"1234567")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 4n the str4ng 4 of the 4nput.")))));
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"3", (String)"11111111")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 1n the str1ng 1 of the 1nput.", (String)"the number of odd elements 8n the str8ng 8 of the 8nput.")))));
    assert(oddCount((new ArrayList<String>(Arrays.asList((String)"271", (String)"137", (String)"314")))).equals((new ArrayList<String>(Arrays.asList((String)"the number of odd elements 2n the str2ng 2 of the 2nput.", (String)"the number of odd elements 3n the str3ng 3 of the 3nput.", (String)"the number of odd elements 2n the str2ng 2 of the 2nput.")))));
    }

}
