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

        Stack<Character> pathStack = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            char path = s.charAt(i);

            if (i > 0 && seaLevel == 0){
                int halfStack = pathStack.size() % 2;
                int pathCheck = 0;

                for (int j = 0 ; j < halfStack; j++){
                    if (pathStack.get(j) == 'D'){
                        break;
                    }
                    pathCheck++;
                }
                if (pathCheck == halfStack){
                    valley++;
                }
            }
            seaLevel += path == 'D' ? -1 : 1;
            pathStack.add(path);

        }
        return valley;
    }


}
