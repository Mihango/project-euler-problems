package labs.khobfa.geekforgeeks;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

// check whether it can map aba can map to xcc ---b to x and aa to cc
public class CharacterMapping {
    public static void main(String[] args) {
        System.out.println("Character map >>>> abbc and caab " + checkMatching("abbc", "caabd"));
    }

    public static boolean checkMatching(String s1, String s2) {
        if(s1.length() != s2.length()) {
            return false;
        }


        boolean matching = false;

        // loop through
        HashMap<Character, Integer> s1Chars = new HashMap<>();
        HashMap<Character, Integer> s2Chars = new HashMap<>();

        for(int i =0; i<s1.length();i++) {
            // save s1 to hash map
            if(s1Chars.containsKey(s1.charAt(i))){
                s1Chars.put(s1.charAt(i), s1Chars.get(s1.charAt(i)) + 1);
            } else {
                s1Chars.put(s1.charAt(i), 1);
            }

            // save s2 ro hash map
            if(s2Chars.containsKey(s2.charAt(i))){
                s2Chars.put(s2.charAt(i), s2Chars.get(s2.charAt(i)) + 1);
            } else {
                s2Chars.put(s2.charAt(i), 1);
            }
        }

        Collection<Integer> s1List = s1Chars.values();
        Collection<Integer> s2List = s2Chars.values();

        int count = 0;

        for (int item : s1List) {
            if(s2List.contains(item)) {
                s2List.remove(item);
                count++;
            } else {
                break;
            }
        }

        if(count == s1List.size()) {
            matching = true;
        }

        return matching;
    }
}
