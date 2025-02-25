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

        // create ArrayList for planets in order of proximity to sun
        ArrayList<String> planets = new ArrayList<String>();
        // check if planet1 is a real planet
        if (planet1.equals("Mercury")) {
            // if planet1 is mercury, add it to planets ArrayList
            planets.add(planet1);
        } else if (planet1.equals("Venus")) {
            planets.add(planet1);
        } else if (planet1.equals("Earth")) {
            planets.add(planet1);
        } else if (planet1.equals("Mars")) {
            planets.add(planet1);
        } else if (planet1.equals("Jupiter")) {
            planets.add(planet1);
        } else if (planet1.equals("Saturn")) {
            planets.add(planet1);
        } else if (planet1.equals("Uranus")) {
            planets.add(planet1);
        } else if (planet1.equals("Neptune")) {
            planets.add(planet1);
        } else {
            // if planet1 is not a real planet, return empty ArrayList
            planets = new ArrayList<String>();
            return planets;
        }
        // check if planet2 is a real planet
        if (planet2.equals("Mercury")) {
            // if planet2 is mercury, add it to planets ArrayList
            planets.add(planet2);
        } else if (planet2.equals("Venus")) {
            planets.add(planet2);
        } else if (planet2.equals("Earth")) {
            planets.add(planet2);
        } else if (planet2.equals("Mars")) {
            planets.add(planet2);
        } else if (planet2.equals("Jupiter")) {
            planets.add(planet2);
        } else if (planet2.equals("Saturn")) {
            planets.add(planet2);
        } else if (planet2.equals("Uranus")) {
            planets.add(planet2);
        } else if (planet2.equals("Neptune")) {
            planets.add(planet2);
        } else {
            // if planet2 is not a real planet, return empty ArrayList
            planets = new ArrayList<String>();
            return planets;
        }
        // create ArrayList of planets between planet1 and planet2 in order
        ArrayList<String> planetsBetween = new ArrayList<String>();
        // if planet1 is not the first planet in order, add the rest of the
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
