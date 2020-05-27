package programmers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AnImcompletePlayerTest {

    @Test
    public void solution() {
        AnImcompletePlayer anImcompletePlayer = new AnImcompletePlayer();
        String[] participantList = {"leo", "kiki", "eden"};
        String[] completionList = {"eden", "kiki"};
        String result = anImcompletePlayer.solution(participantList, completionList);
        assertEquals("leo", result);

        participantList = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        completionList =new String[]{"josipa", "filipa", "marina", "nikola"};
        result = anImcompletePlayer.solution(participantList, completionList);
        assertEquals("vinko", result);

        participantList = new String[]{"mislav", "stanko", "mislav", "ana"};
        completionList =new String[]{"stanko", "ana", "mislav"};
        result = anImcompletePlayer.solution(participantList, completionList);
        assertEquals("mislav", result);
    }
}