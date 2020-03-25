package hackerrank;

import java.util.Stack;

public class JumpingOnTheClouds {

    static int jumpingOnClouds(int[] c) {

        Stack cloudStack = new Stack();
        int jump = 0;

        for (int cloud : c) {
            if (cloud == 1){
                jump++;
                cloudStack.clear();
            }else {
                cloudStack.add(cloud);
            }
            if (cloudStack.size() >= 2){
                jump++;
                cloudStack.clear();
            }
        }
        return jump;
    }
}
