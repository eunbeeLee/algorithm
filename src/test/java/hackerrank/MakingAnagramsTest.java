package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class MakingAnagramsTest {

    @Test
    public void makeAnagram() {
        String a = "cde";
        String b = "abc";

        int deletions = MakingAnagrams.makeAnagram(a, b);
        assertEquals(4, deletions);
    }
}