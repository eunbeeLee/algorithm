package hackerrank;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountingValleysTest {

    @Test
    public void countingValleys() {
        int n = 8;
        String s = "UDDDUDUU";
        int result = CountingValleys.countingValleys(n, s);

        assertEquals(1, result);
    }
}