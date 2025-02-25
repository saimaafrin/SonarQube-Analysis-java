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

        if(file_name.length() > 14){
            return "No";
        }
        char[] char_list = file_name.toCharArray();
        int digit_count = 0;
        int period_count = 0;
        int alpha_count = 0;
        String substring_1 = "";
        String substring_2 = "";
        int i = 0;
        for(i = 0; i < char_list.length; i++){
            if(char_list[i] >= '0' && char_list[i] <= '9'){
                digit_count++;
            } else if(char_list[i] == '.'){
                period_count++;
            } else if((char_list[i] >= 'a' && char_list[i] <= 'z') || (char_list[i] >= 'A' && char_list[i] <= 'Z')){
                alpha_count++;
            }
        }
        if(digit_count > 3){
            return "No";
        }
        if(period_count == 0){
            return "No";
        }
        if(alpha_count == 0){
            return "No";
        }
        if(digit_count + alpha_count + period_count != char_list.length){
            return "No";
        }
        int dot_pos = file_name.indexOf(".");
        substring_1 = file_name.substring(0, dot_pos);
        substring_2 = file_name.substring(dot_pos + 1, char_list.length);
        if(substring_1.length() == 0){
            return "No";
        }
        if(!substring_2.equals("txt") && !substring_2.equals("exe") && !substring_2.equals("dll")){
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
