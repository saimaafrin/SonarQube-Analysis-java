import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // There are eight planets in our solar system: the closerst to the Sun 
    // is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn, 
    // Uranus, Neptune.
    // Write a function that takes two planet names as strings planet1 and planet2. 
    // The function should return a pair containing all planets whose orbits are 
    // located between the orbit of planet1 and the orbit of planet2, sorted by 
    // the proximity to the sun. 
    // The function should return an empty pair if planet1 or planet2
    // are not correct planet names. 
    // Examples
    // >>> bf(("Jupiter"), ("Neptune"))
    // (new ArrayList<String>(Arrays.asList((String)"Saturn", (String)"Uranus")))
    // >>> bf(("Earth"), ("Mercury"))
    // (ArrayList<String>("Venus"))
    // >>> bf(("Mercury"), ("Uranus"))
    // (new ArrayList<String>(Arrays.asList((String)"Venus", (String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn")))
    public static ArrayList<String> bf(String planet1, String planet2) {

        ArrayList<String> al = new ArrayList<>();
        if (planet1.equals("Mercury")) {
            if (planet2.equals("Venus")) {
                al.add("Venus");
            } else if (planet2.equals("Earth")) {
                al.add("Venus");
                al.add("Earth");
            } else if (planet2.equals("Mars")) {
                al.add("Venus");
                al.add("Earth");
                al.add("Mars");
            } else if (planet2.equals("Jupiter")) {
                al.add("Venus");
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
            } else if (planet2.equals("Saturn")) {
                al.add("Venus");
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
                al.add("Saturn");
            } else if (planet2.equals("Uranus")) {
                al.add("Venus");
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
                al.add("Saturn");
                al.add("Uranus");
            } else if (planet2.equals("Neptune")) {
                al.add("Venus");
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
                al.add("Saturn");
                al.add("Uranus");
                al.add("Neptune");
            }
        } else if (planet1.equals("Venus")) {
            if (planet2.equals("Earth")) {
                al.add("Earth");
            } else if (planet2.equals("Mars")) {
                al.add("Earth");
                al.add("Mars");
            } else if (planet2.equals("Jupiter")) {
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
            } else if (planet2.equals("Saturn")) {
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
                al.add("Saturn");
            } else if (planet2.equals("Uranus")) {
                al.add("Earth");
                al.add("Mars");
                al.add("Jupiter");
                al.add("Saturn");
                al.add("Uranus");
            }
    }
    public static void main(String[] args) {
    assert(bf(("Jupiter"), ("Neptune")).equals((new ArrayList<String>(Arrays.asList((String)"Saturn", (String)"Uranus")))));
    assert(bf(("Earth"), ("Mercury")).equals((new ArrayList<String>(Arrays.asList((String)"Venus")))));
    assert(bf(("Mercury"), ("Uranus")).equals((new ArrayList<String>(Arrays.asList((String)"Venus", (String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn")))));
    assert(bf(("Neptune"), ("Venus")).equals((new ArrayList<String>(Arrays.asList((String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn", (String)"Uranus")))));
    assert(bf(("Earth"), ("Earth")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(bf(("Mars"), ("Earth")).equals((new ArrayList<String>(Arrays.asList()))));
    assert(bf(("Jupiter"), ("Makemake")).equals((new ArrayList<String>(Arrays.asList()))));
    }

}
