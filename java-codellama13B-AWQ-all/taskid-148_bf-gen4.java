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

        // create an array to hold the planets in the order of their orbits
        ArrayList<String> planetOrder = new ArrayList<String>(Arrays.asList((String)"Mercury", (String)"Venus", (String)"Earth", (String)"Mars", (String)"Jupiter", (String)"Saturn", (String)"Uranus", (String)"Neptune"));
        // create an array to hold the planets in the order of their orbits
        ArrayList<String> result = new ArrayList<String>();
        // find the indexes of the two planets and the planets between them
        int i = planetOrder.indexOf(planet1);
        int j = planetOrder.indexOf(planet2);
        if (i == -1 || j == -1) { // if either planet was not found
            return result; // return an empty array
        }
        else { // if the planets were found
            // add the planets between the two indexes in order
            if (i < j) { // if planet1 is before planet2
                for (int k = i+1; k <= j; k++) { // add the planets in between
                    result.add(planetOrder.get(k)); // add the planet at index k
                }
            }
            else { // if planet1 is after planet2
                for (int k = i-1; k >= j; k--) { // add the planets in between
                    result.add(planetOrder.get(k)); // add the planet at index k
                }
            }
            // return the planets in order
            return result;
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
