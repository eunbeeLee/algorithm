package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class LeftRotationTest {

    @Test
    public void rotLeft() {
        int[] array = {1, 2, 3, 4, 5};
        int d = 4;

        int[] result = LeftRotation.rotLeft(array, d);

        int[] expectedArr = {5, 1, 2, 3, 4};
        assertArrayEquals(expectedArr, result);
    }
}