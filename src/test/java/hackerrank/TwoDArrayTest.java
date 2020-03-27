package hackerrank;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class TwoDArrayTest {

    @Test
    public void hourglassSum() {
        int[][] arr = {{1,1,1,0,0,0},
                        {0,1,0,0,0,0},
                        {1,1,1,0,0,0},
                        {0,0,2,4,4,0},
                        {0,0,0,2,0,0},
                        {0,0,1,2,4,0}};

        int result = TwoDArray.hourglassSum(arr);

        assertEquals(19, result);
    }
}