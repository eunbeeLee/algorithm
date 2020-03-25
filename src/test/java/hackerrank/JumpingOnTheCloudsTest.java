package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class JumpingOnTheCloudsTest {

    @Test
    public void jumpingOnClouds(){
        int[] arr = {0, 0, 0, 0, 1, 0};

        int result = JumpingOnTheClouds.jumpingOnClouds(arr);
        assertEquals(3, result);

        int[] arr2 = {0, 0, 1, 0, 0, 1, 0};
        int result2 = JumpingOnTheClouds.jumpingOnClouds(arr2);
        assertEquals(4, result2);

    }

}