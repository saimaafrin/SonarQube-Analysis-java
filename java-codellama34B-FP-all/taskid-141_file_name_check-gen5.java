import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Create a function which takes a string representing a file's name, and returns
    // 'Yes' if the the file's name is valid, and returns 'No' otherwise.
    // A file's name is considered to be valid if and only if all the following conditions 
    // are met:
    // - There should not be more than three digits ('0'-'9') in the file's name.
    // - The file's name contains exactly one dot '.'
    // - The substring before the dot should not be empty, and it starts with a letter from 
    // the latin alphapet ('a'-'z' and 'A'-'Z').
    // - The substring after the dot should be one of these: ['txt', 'exe', 'dll']
    // Examples:
    // >>> fileNameCheck(("example.txt"))
    // ("Yes")
    // >>> fileNameCheck(("1example.dll"))
    // ("No")
    public static String fileNameCheck(String file_name) {

        int n=0;
        for (int i=0; i<file_name.length(); i++) {
            if (Character.isDigit(file_name.charAt(i)))
                n++;
        }
        if (n>3)
            return "No";
        int dot_pos = file_name.indexOf('.');
        if (dot_pos == -1)
            return "No";
        else {
            String sub1 = file_name.substring(0, dot_pos);
            String sub2 = file_name.substring(dot_pos+1);
            if (!(sub1.startsWith("a") || sub1.startsWith("b") || sub1.startsWith("c") || sub1.startsWith("d") || sub1.startsWith("e") || sub1.startsWith("f") || sub1.startsWith("g") || sub1.startsWith("h") || sub1.startsWith("i") || sub1.startsWith("j") || sub1.startsWith("k") || sub1.startsWith("l") || sub1.startsWith("m") || sub1.startsWith("n") || sub1.startsWith("o") || sub1.startsWith("p") || sub1.startsWith("q") || sub1.startsWith("r") || sub1.startsWith("s") || sub1.startsWith("t") || sub1.startsWith("u") || sub1.startsWith("v") || sub1.startsWith("w") || sub1.startsWith("x") || sub1.startsWith("y") || sub1.startsWith("z") || sub1.startsWith("A") || sub1.startsWith("B") || sub1.startsWith("C") || sub1.startsWith("D") || sub1.startsWith("E") || sub1.startsWith("F") || sub1.startsWith("G") || sub1.startsWith("H") || sub1.startsWith("I") || sub1.startsWith("J") || sub1.startsWith("K") || sub1.startsWith("L") || sub1.startsWith("M") || sub1.startsWith("N") || sub1.startsWith("O") || sub1.startsWith("P") || sub1.startsWith("Q") || sub1.startsWith("R") || sub1.startsWith("S") || sub1.startsWith("T") || sub1.startsWith("U") || sub1.startsWith("V") || sub1.startsWith("W") || sub1.startsWith("X") || sub1.startsWith("Y") || sub1.startsWith("Z")))
                return "No";
            else if (sub2.equals("txt") || sub2.equals("exe") || sub2.equals("dll"))
                return "Yes";
            else
                return "No";
        }
    }
    public static void main(String[] args) {
    assert(fileNameCheck(("example.txt")).equals(("Yes")));
    assert(fileNameCheck(("1example.dll")).equals(("No")));
    assert(fileNameCheck(("s1sdf3.asd")).equals(("No")));
    assert(fileNameCheck(("K.dll")).equals(("Yes")));
    assert(fileNameCheck(("MY16FILE3.exe")).equals(("Yes")));
    assert(fileNameCheck(("His12FILE94.exe")).equals(("No")));
    assert(fileNameCheck(("_Y.txt")).equals(("No")));
    assert(fileNameCheck(("?aREYA.exe")).equals(("No")));
    assert(fileNameCheck(("/this_is_valid.dll")).equals(("No")));
    assert(fileNameCheck(("this_is_valid.wow")).equals(("No")));
    assert(fileNameCheck(("this_is_valid.txt")).equals(("Yes")));
    assert(fileNameCheck(("this_is_valid.txtexe")).equals(("No")));
    assert(fileNameCheck(("#this2_i4s_5valid.ten")).equals(("No")));
    assert(fileNameCheck(("@this1_is6_valid.exe")).equals(("No")));
    assert(fileNameCheck(("this_is_12valid.6exe4.txt")).equals(("No")));
    assert(fileNameCheck(("all.exe.txt")).equals(("No")));
    assert(fileNameCheck(("I563_No.exe")).equals(("Yes")));
    assert(fileNameCheck(("Is3youfault.txt")).equals(("Yes")));
    assert(fileNameCheck(("no_one#knows.dll")).equals(("Yes")));
    assert(fileNameCheck(("1I563_Yes3.exe")).equals(("No")));
    assert(fileNameCheck(("I563_Yes3.txtt")).equals(("No")));
    assert(fileNameCheck(("final..txt")).equals(("No")));
    assert(fileNameCheck(("final132")).equals(("No")));
    assert(fileNameCheck(("_f4indsartal132.")).equals(("No")));
    assert(fileNameCheck((".txt")).equals(("No")));
    assert(fileNameCheck(("s.")).equals(("No")));
    }

}
