package programmers;

import org.junit.Test;

import static org.junit.Assert.*;

public class Kakao19CraneGameTest {

    @Test
    public void solution() {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        int result = Kakao19CraneGame.solution(board, moves);
        assertEquals(4, result);
    }
}