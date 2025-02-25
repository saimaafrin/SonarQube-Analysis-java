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

        String[] arr = new String[] { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune" };
        int planet1Index = -1, planet2Index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(planet1)) {
                planet1Index = i;
                break;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(planet2)) {
                planet2Index = i;
                break;
            }
        }
        if (planet1Index == -1 || planet2Index == -1)
            return new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        if (planet1Index < planet2Index) {
            for (int i = planet1Index + 1; i < planet2Index; i++)
                ans.add(arr[i]);
        }
        else {
            for (int i = planet1Index + 1; i < arr.length; i++)
                ans.add(arr[i]);
            for (int i = 0; i < planet2Index; i++)
                ans.add(arr[i]);
        }
        return ans;
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
