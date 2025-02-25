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

        // Write your code here
        ArrayList<String> sol = new ArrayList<String>();
        if (planet1.equals("Mercury")) {
            switch (planet2) {
                case "Venus": {
                    sol.add("Venus");
                    break;
                }
                case "Earth": {
                    sol.add("Venus");
                    sol.add("Earth");
                    break;
                }
                case "Mars": {
                    sol.add("Venus");
                    sol.add("Earth");
                    sol.add("Mars");
                    break;
                }
                case "Jupiter": {
                    sol.add("Venus");
                    sol.add("Earth");
                    sol.add("Mars");
                    sol.add("Jupiter");
                    break;
                }
                case "Saturn": {
                    sol.add("Venus");
                    sol.add("Earth");
                    sol.add("Mars");
                    sol.add("Jupiter");
                    sol.add("Saturn");
                    break;
                }
                case "Uranus": {
                    sol.add("Venus");
                    sol.add("Earth");
                    sol.add("Mars");
                    sol.add("Jupiter");
                    sol.add("Saturn");
                    sol.add("Uranus");
                    break;
                }
                case "Neptune": {
                    sol.add("Venus");
                    sol.add("Earth");
                    sol.add("Mars");
                    sol.add("Jupiter");
                    sol.add("Saturn");
                    sol.add("Uranus");
                    sol.add("Neptune");
                    break;
                }
                default: {
                    break;
                }
            }
        } else if (planet1.equals("Venus")) {
            switch (planet2) {
                case "Earth": {
                    sol.add("Earth");
                    break;
                }
                case "Mars": {
                    sol.add("Earth");
                    sol.add("Mars");
                    break;
                }
                case "Jupiter": {
                    sol.add("Earth");
                    sol.add("Mars");
                    sol.add("Jupiter");
                    break;
                }
                case "Saturn": {
                    sol.add("Earth");
                    sol.add("Mars");
                    sol.add("Jupiter");
                    sol.
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
