package programmers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnImcompletePlayerTest {

    @Test
    public void solution() {
        AnImcompletePlayer anImcompletePlayer = new AnImcompletePlayer();
        String[] participantList = {"leo", "kiki", "eden"};
        String[] completionList = {"eden", "kiki"};
        String result = anImcompletePlayer.solution(participantList, completionList);
        assertEquals("leo", result);
    }
}