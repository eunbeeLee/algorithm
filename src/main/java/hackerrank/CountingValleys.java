package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

/**
 * [Function Description]
 * Complete the countingValleys function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.
 *
 * countingValleys has the following parameter(s):
 *
 * n: the number of steps Gary takes
 * s: a string describing his path
 *
 * [Input Format]
 * The first line contains an integer , the number of steps in Gary's hike.
 * The second line contains a single string , of  characters that describe his path.
 *
 * [Output Format]
 * Print a single integer that denotes the number of valleys Gary walked through during his hike.
 */
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int valley = 0;
        int seaLevel = 0;

        Stack<Character> pathStack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++){

            char path = s.charAt(i);

            seaLevel += path == 'D'? -1 : 1;
            pathStack.add(path);

            if (seaLevel == 0 && pathStack.size() > 0){
                if (pathStack.peek() == 'U'){
                    valley ++;
                    pathStack.clear();
                }
            }
        }
        return valley;
    }


}
