package hakerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SockMerchantTest {

    @Test
    void sockMerchant() {
        int[] arrData = {1, 2, 1, 2, 1, 3, 2};
        int result = SockMerchant.sockMerchant(7, arrData);
        assertEquals(2, result);
    }
}