package hackerrank;

import java.util.HashMap;
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
        int deletions = 0;
        Map<Character, Character> anagramMap = new HashMap<>();
        int shortLength = a.length();

        if (a.length() > b.length()){
            shortLength = b.length();
            deletions += a.length() - b.length();
        }
        if (a.length() < b.length()){
            deletions += b.length() - a.length();
        }

        /**
         * c d e
         * a b c
         * c:a
         * d:b
         * e:c
         *
         */
        for (int i= 0; i < shortLength; i++){
            anagramMap.put(a.charAt(i), b.charAt(i));
        }

        for (Character key : anagramMap.keySet()) {
            if (anagramMap.containsValue(key)){
                anagramMap.remove(key);
                deletions++;
            }else{
                Character newKey = anagramMap.get(key);
                if (!anagramMap.get(newKey).equals(key)){
                    deletions +=2;
                    anagramMap.remove(key);
                    anagramMap.remove(newKey);
                }
            }
        }
        return deletions;
    }
}
