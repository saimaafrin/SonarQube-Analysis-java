import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Given an array array list of integers, sort the integers that are between 1 and 9 inclusive,
    // reverse the resulting array array list, and then replace each digit by its corresponding name from
    // "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine".
    // For example:
    // >>> byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l))))
    // (new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))
    // If the array array list is empty, return an empty array array list:
    // >>> byLength((new ArrayList<Long>(Arrays.asList())))
    // (new ArrayList<String>(Arrays.asList()))
    // If the array array list has any strange number ignore it:
    // >>> byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l))))
    // (new ArrayList<String>(Arrays.asList((String)"One")))
    public static ArrayList<String> byLength(ArrayList<Long> arr) {

        // Fill in your code here.
        // arr.stream().filter(x -> x >= 1l && x <= 9l).sorted().map(x -> x.toString()).collect(Collectors.toList()).stream().map(x -> {if (x.equals("1")) {return "One";} if (x.equals("2")) {return "Two";} if (x.equals("3")) {return "Three";} if (x.equals("4")) {return "Four";} if (x.equals("5")) {return "Five";} if (x.equals("6")) {return "Six";} if (x.equals("7")) {return "Seven";} if (x.equals("8")) {return "Eight";} if (x.equals("9")) {return "Nine";} else {return "One";}}).collect(Collectors.toCollection(ArrayList::new));
        // return arr.stream().filter(x -> x >= 1l && x <= 9l).sorted().map(x -> x.toString()).collect(Collectors.toList()).stream().map(x -> {if (x.equals("1")) {return "One";} if (x.equals("2")) {return "Two";} if (x.equals("3")) {return "Three";} if (x.equals("4")) {return "Four";} if (x.equals("5")) {return "Five";} if (x.equals("6")) {return "Six";} if (x.equals("7")) {return "Seven";} if (x.equals("8")) {return "Eight";} if (x.equals("9")) {return "Nine";} else {return "One";}}).collect(Collectors.toCollection(ArrayList::new));
        // arr.stream().filter(x -> x >= 1l && x <= 9l).sorted().map(x -> x.toString()).collect(Collectors.toList()).stream().map(x -> {if (x.equals("1")) {return "One";} if (x.equals("2")) {return "Two";} if (x.equals("3")) {return "Three";} if (x.equals("4")) {return "Four";} if (x.equals("5")) {return "Five";} if (x.equals("6")) {return "Six";} if (x.equals("7")) {return "Seven";} if (x.equals("8")) {return "Eight";} if (x.equals("9")) {return "Nine";} else {return "One";}}).collect(Collectors.toCollection(ArrayList::new));
        // arr.stream().filter(x
    }
    public static void main(String[] args) {
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)1l, (long)4l, (long)5l, (long)8l, (long)2l, (long)3l)))).equals((new ArrayList<String>(Arrays.asList((String)"Eight", (String)"Five", (String)"Four", (String)"Three", (String)"Two", (String)"Two", (String)"One", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList()))).equals((new ArrayList<String>(Arrays.asList()))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)55l)))).equals((new ArrayList<String>(Arrays.asList((String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)1l, (long)-1l, (long)3l, (long)2l)))).equals((new ArrayList<String>(Arrays.asList((String)"Three", (String)"Two", (String)"One")))));
    assert(byLength((new ArrayList<Long>(Arrays.asList((long)9l, (long)4l, (long)8l)))).equals((new ArrayList<String>(Arrays.asList((String)"Nine", (String)"Eight", (String)"Four")))));
    }

}
