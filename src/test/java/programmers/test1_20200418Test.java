package programmers;

import org.junit.Test;

import static org.junit.Assert.*;

public class test1_20200418Test {

    @Test
    public void solution() {
        String present = "00000000000000000000";
        String solve = "91919191919191919191";

//        int result = test1_20200418.solution(present, solve);

//        assertEquals(20, result);
        present = "82195";
        solve = "64723";

        int result = test1_20200418.solution(present, solve);

        assertEquals(13, result);
    }
}