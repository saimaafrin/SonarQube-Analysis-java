import java.util.*;
import java.lang.reflect.*;
import org.javatuples.*;
import java.security.*;
import java.math.*;
import java.io.*;
import java.util.stream.*;
class Problem {
    // Input to this function is a string representing musical notes in a special ASCII format.
    // Your task is to parse this string and return array list of integers corresponding to how many beats does each
    // not last.
    // Here is a legend:
    // 'o' - whole note, lasts four beats
    // 'o|' - half note, lasts two beats
    // '.|' - quater note, lasts one beat
    // >>> parseMusic(("o o| .| o| o| .| .| .| .| o o"))
    // (new ArrayList<Long>(Arrays.asList((long)4l, (long)2l, (long)1l, (long)2l, (long)2l, (long)1l, (long)1l, (long)1l, (long)1l, (long)4l, (long)4l)))
    public static ArrayList<Long> parseMusic(String music_string) {

        // This is a python solution
        // It is not a good idea to use python for solving this problem.
        // Use java for solving it instead.
        music_string = music_string.replace("|", "");
        int whole = 4;
        int half = 2;
        int quarter = 1;
        String[] split = music_string.split(" ");
        ArrayList<Long> list = new ArrayList<Long>();
        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("o")) {
                list.add((long) whole);
            } else if (split[i].equals("o.")) {
                list.add((long) half);
            } else if (split[i].equals(".|")) {
                list.add((long) quarter);
            } else {
                list.add((long) quarter);
                list.add((long) quarter);
            }
        }
        return list;
    }
    public static void main(String[] args) {
    assert(parseMusic(("")).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(parseMusic(("o o o o")).equals((new ArrayList<Long>(Arrays.asList((long)4l, (long)4l, (long)4l, (long)4l)))));
    assert(parseMusic((".| .| .| .|")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)))));
    assert(parseMusic(("o| o| .| .| o o o o")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)1l, (long)1l, (long)4l, (long)4l, (long)4l, (long)4l)))));
    assert(parseMusic(("o| .| o| .| o o| o o|")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)2l, (long)1l, (long)4l, (long)2l, (long)4l, (long)2l)))));
    }

}
