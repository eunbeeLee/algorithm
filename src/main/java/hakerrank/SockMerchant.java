package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * john works at a clothing store. He has a large pile of socks that he must pair by color for sale.
 * Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * For example, there are n = 7 socks with colors ar = [1, 2, 1, 2, 3, 1, 2].
 * There is one pair of color 1 and one of color 2. There are three odd socks left, one of each color. The number of pairs is 2.
 */
public class SockMerchant {

    static int sockMerchant(int n, int[] ar) {
        int result = 0;
        List<Integer> colorList = new ArrayList();

        for(int color : ar){
            int colorIndex = colorList.indexOf(color);

            if (colorIndex >= 0){
                colorList.remove(colorIndex);
                result++;
            }else{
                colorList.add(color);
            }
        }

        return result;
    }

}
