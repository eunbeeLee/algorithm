package hackerrank;

/**
 *
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 *
 * You are given a string containing characters A and B only.
 * Your task is to change it into a string such that there are no matching adjacent characters.
 * To do this, you are allowed to delete zero or more characters in the string.
 *
 * Your task is to find the minimum number of required deletions.
 * For example, given the string s=AABAAB, remove an A at positions 0 and 3 to make s=ABAB in 2 deletions.
 */
public class AlternatingCharacters {

    static int alternatingCharacters(String string) {
        int deletion =0;
        Character comparisonTarget = string.charAt(0);

            for (int i = 1; i < string.length(); i++){
                Character character =string.charAt(i);

                if (comparisonTarget.equals(character)){
                    deletion++;
                }else{
                    comparisonTarget = character;
                }
            }
        return deletion;
    }

}
