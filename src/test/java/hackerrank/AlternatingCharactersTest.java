package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlternatingCharactersTest {

    @Test
    public void alternatingCharacters() {
        String s = "AAAA";
        int deletions = AlternatingCharacters.alternatingCharacters(s);
        assertEquals(3, deletions);

        s = "BBBBB";
        deletions = AlternatingCharacters.alternatingCharacters(s);
        assertEquals(4, deletions);

        s = "ABABABAB";
        deletions = AlternatingCharacters.alternatingCharacters(s);
        assertEquals(0, deletions);

        s = "BABABA";
        deletions = AlternatingCharacters.alternatingCharacters(s);
        assertEquals(0, deletions);

        s = "AAABBB";
        deletions = AlternatingCharacters.alternatingCharacters(s);
        assertEquals(4, deletions);

    }
}