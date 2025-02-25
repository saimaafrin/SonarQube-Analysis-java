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

        ArrayList<Long> notes = new ArrayList<Long>();
        music_string = music_string.replace(" ", "");
        int start_index = 0;
        int end_index = 0;
        String token;
        for(int i = 0; i < music_string.length(); i++){
            if(music_string.charAt(i) == 'o'){
                if(music_string.charAt(i+1) == '|'){
                    token = music_string.substring(start_index, i+1);
                    notes.add((long)2);
                }
                else{
                    token = music_string.substring(start_index, i+1);
                    notes.add((long)4);
                }
                start_index = i+1;
            }
            else if(music_string.charAt(i) == '.'){
                if(music_string.charAt(i+1) == '|'){
                    token = music_string.substring(start_index, i+1);
                    notes.add((long)1);
                }
                else{
                    token = music_string.substring(start_index, i+1);
                    notes.add((long)1);
                }
                start_index = i+1;
            }
            else if(music_string.charAt(i) == '|'){
                token = music_string.substring(start_index, i+1);
                notes.add((long)2);
                start_index = i+1;
            }
        }
        return notes;
    }
    public static void main(String[] args) {
    assert(parseMusic(("")).equals((new ArrayList<Long>(Arrays.asList()))));
    assert(parseMusic(("o o o o")).equals((new ArrayList<Long>(Arrays.asList((long)4l, (long)4l, (long)4l, (long)4l)))));
    assert(parseMusic((".| .| .| .|")).equals((new ArrayList<Long>(Arrays.asList((long)1l, (long)1l, (long)1l, (long)1l)))));
    assert(parseMusic(("o| o| .| .| o o o o")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)2l, (long)1l, (long)1l, (long)4l, (long)4l, (long)4l, (long)4l)))));
    assert(parseMusic(("o| .| o| .| o o| o o|")).equals((new ArrayList<Long>(Arrays.asList((long)2l, (long)1l, (long)2l, (long)1l, (long)4l, (long)2l, (long)4l, (long)2l)))));
    }

}
