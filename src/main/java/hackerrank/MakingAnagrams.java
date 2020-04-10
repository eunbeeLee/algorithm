package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 *
 * Alice is taking a cryptography class and finding anagrams to be very useful.
 * We consider two strings to be anagrams of each other if the first string's letters can be rearranged to form the second string.
 * In other words, both strings must contain the same exact letters in the same exact frequency
 * For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
 *
 * Alice decides on an encryption scheme involving two large strings
 * where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams.
 * Can you help her find this number?
 *
 * Given two strings, a and b, that may or may not be of the same length,
 * determine the minimum number of character deletions required to make a and b anagrams.
 * Any characters can be deleted from either of the strings.
 *
 * For example, if a=cde and b=dcf, we can delete e from string a and f from string b
 * so that both remaining strings are cd and dc which are anagrams.
 */
public class MakingAnagrams {

    static int makeAnagram(String a, String b) {
        List<Character> keyList = new ArrayList<>();
        List<Character> valueList = new ArrayList<>();

        int shortLength = a.length() > b.length()? b.length(): a.length();

        /**
         * c d e
         * a b c
         *
         */
        for (int i= 0; i < shortLength; i++){
            keyList.add(a.charAt(i));
            valueList.add(b.charAt(i));
        }

        for (int i = 0; i < shortLength; i++){
            if (shortLength >= keyList.size()){
                break;
            }
            Character findValue = keyList.get(i);

            int valueIndex = valueList.indexOf(findValue);
            if (!(valueIndex > 0 && valueList.get(i).equals(keyList.get(valueIndex)))){

                keyList.remove(valueIndex);
                keyList.remove(i);

                valueList.remove(valueIndex);
                valueList.remove(i);
            }
        }


        return shortLength - keyList.size();
    }
}
