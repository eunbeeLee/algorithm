package hackerrank;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.*;

@SpringBootTest
public class RepeatedStringTest {

    @Test
    public void repeatedString() {

        String text = "aba";
        long repeatedStringLength = 10L;

        long result = RepeatedString.repeatedString(text, repeatedStringLength);

        assertEquals(7L, result);
    }
}