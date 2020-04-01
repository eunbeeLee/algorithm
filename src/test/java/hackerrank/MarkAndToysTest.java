package hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarkAndToysTest {

    @Test
    void maximumToys() {

        int[] toysPrices = {1, 12, 5, 111, 200, 1000, 10};
        int budget = 50;

        int toysCount = MarkAndToys.maximumToys(toysPrices, budget);
        assertEquals(4, toysCount);
    }
}