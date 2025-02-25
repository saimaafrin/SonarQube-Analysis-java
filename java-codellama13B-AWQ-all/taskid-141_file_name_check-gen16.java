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

        if (file_name.length() > 9) {
            return "No";
        }
        if (file_name.length() == 0) {
            return "No";
        }
        if (file_name.length() == 1) {
            if (file_name.charAt(0) >= 'a' && file_name.charAt(0) <= 'z' ||
                file_name.charAt(0) >= 'A' && file_name.charAt(0) <= 'Z') {
                return "Yes";
            }
            return "No";
        }
        if (file_name.charAt(0) == '.' || file_name.charAt(file_name.length() - 1) == '.') {
            return "No";
        }
        int dot_idx = -1;
        for (int i = 0; i < file_name.length(); i++) {
            if (file_name.charAt(i) == '.') {
                dot_idx = i;
                break;
            }
        }
        if (dot_idx == -1) {
            return "No";
        }
        String prefix = file_name.substring(0, dot_idx);
        String suffix = file_name.substring(dot_idx + 1, file_name.length());
        if (prefix.length() == 0) {
            return "No";
        }
        if (prefix.length() > 3) {
            return "No";
        }
        for (int i = 0; i < prefix.length(); i++) {
            if (prefix.charAt(i) < 'A' || prefix.charAt(i) > 'z') {
                return "No";
            }
        }
        if (suffix.compareTo("txt") != 0 && suffix.compareTo("exe") != 0 && suffix.compareTo("dll") != 0) {
            return "No";
        }
        return "Yes";
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
